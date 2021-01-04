import CSVCreator._
import scala.io.StdIn._
import sys.process._
import scala.language.postfixOps
import scala.collection.mutable.ListBuffer

object InterfaceMethods {
    
    def createSmallerDataSet() {
        println(s"Welcome! This Runner is for reducing a dataset down even further IOT to reduce processing time with hive\n")
        println(s"What is the path to your csv?\n")
        val fileName = readLine()   
        println(s"Here are you column names in order \n")
        val headersAndBody: Tuple2[List[String],List[List[String]]] = createCSV(fileName)
        for (header <- headersAndBody._1){
            println(header)
        }
        println("Starting from 0 what column would you like to organize your new dataset by? \n")
        val column = readLine().toInt
        println("What word or words would you like to filter by? (if multiple words separate by space don't use commas words must be next to each other in column and in order you input)\n")
        val keyword = readLine()
        println("What would you like to name th new dataset?\n")
        val newDataSetName = readLine()
        val componentsOfCSV: Tuple3[Int,String,String] = new Tuple3(column,keyword.toLowerCase(),newDataSetName)
        println("Please wait creating new dataset")
        reduceByColumn(headersAndBody,componentsOfCSV)
        println(s"Your new dataset $newDataSetName has been created\n")
    }

    def runHadoopTasks(){
        println("What would you like to do?\n" +
        "1. Start Hadoop.\n" +
        "2. Start Yarn.\n" +
        "3. Create hdfs folder.\n" +
        "4. List contents of a folder.\n" +
        "5. Remove a folder.\n" +
        "6. Move a folder.\n" +
        "7. Rename a folder.\n" +
        "8. Move a file from local system to hdfs.\n" +
        "9. Complete a hive task.\n" +
        "10. Quit Hadoop.\n" +
        "11. Quit Yarn.\n" +
        "12. Quit")
        val choice = readLine()
        choice match {
            case "1" => runHadoop()
            case "2" => runYarn()
            case "3" => createHdfsFolder
            case "4" => listContentsOfHdfsFolder()
            case "5" => removeHDFSFolder()
            case "6" => moveHDFSFolder()
            case "7" => renameHDFSFolder()
            case "8" => moveFileFromLocalSystemToHDFS()
            case "9" => runHiveTasks()
            case "10" => stopHadoop()
            case "11" => stopYarn()
            case "12" => System.exit(0)
            case _ => {
                println("Invalid selection") 
                runHadoopTasks()
            }
        }


    }

    // Hadoop functions-------------------------------------------------

    def runHadoop(){
        try {
            println("Starting Hadoop, please wait.")
            "/usr/local/Cellar/hadoop/3.3.0/libexec/sbin/start-dfs.sh".!
        } catch {
            case e: Exception => println("Hadoop is already started.")
        }
        runHadoopTasks()
    }

    def runYarn(){
        try {
            println("Starting Yarn, please wait.")
            "/usr/local/Cellar/hadoop/3.3.0/libexec/sbin/start-yarn.sh".!
         } catch {
            case e: Exception => println("Yarn is already started.")
        }
        runHadoopTasks()
       
    }



    def stopHadoop(){
        try {
            println("Stoping Hadoop, please wait.")
            "/usr/local/Cellar/hadoop/3.3.0/libexec/sbin/stop-dfs.sh".!
        } catch {
            case e: Exception => println("Hadoop isn't running.")
        }
        runHadoopTasks()
    }

    def stopYarn(){
        try {
            println("Stoping Yarn, please wait.")
            "/usr/local/Cellar/hadoop/3.3.0/libexec/sbin/stop-yarn.sh".!
         } catch {
            case e: Exception => println("Yarn isn't running.")
        }
        runHadoopTasks 
    }

    def createHdfsFolder(){
        println("What is the HDFS folder path you want to create?")
        val folderPath = readLine()
        try{
            s"hdfs dfs -mkdir -p $folderPath".!
        }catch {
            case e: Exception => println(s"was unable to create $folderPath")
        }
        runHadoopTasks()
    }

    def listContentsOfHdfsFolder(){
        println("What is the path to the folder?")
        val folderPath = readLine()
        println("Include hidden files? (yes/no)")
        val hidden = readLine()
        hidden match {
            case "yes" =>   try {
                                s"hdfs dfs -ls $folderPath".!
                            } catch {
                                case e: Exception => println("Was unable to complete task.")
                            }
            case "no" => try {
                                s"hdfs dfs -ls -l $folderPath".!
                            } catch {
                                case e: Exception => println("Was unable to complete task.")
                            }
        }
        runHadoopTasks()
        
    }

    def removeHDFSFolder(){
        println("What is the path to the folder?")
        val folderPath = readLine()
        try {
            s"hdfs dfs -rm -r -f $folderPath".!
        } catch {
            case e: Exception => println("Sorry was unable to complete task") 
        }
        runHadoopTasks()
    }

    def moveHDFSFolder(){
        println("What is the from path of the file?")
        val fromPath = readLine()
        println("What is the path you would like to move the folder to?")
        val toPath = readLine()
        try {
            s"hdfs dfs -mv $fromPath $toPath".!
        } catch {
            case e: Exception => println("Sorry was unable to complete the folder move.")
        }
        runHadoopTasks()
    }

    def renameHDFSFolder(){
        println("What is the from path of the file?")
        val fromPath = readLine()
        println("What is the name you would like to rename to?")
        val newFolderName = readLine()
        try {
            s"hdfs dfs -mv $fromPath $newFolderName".!
        } catch {
            case e: Exception => println("Sorry was unable to rename folder.")
        }
        runHadoopTasks()
    }

    def moveFileFromLocalSystemToHDFS(){
         println("What is the from path on the local file system?")
        val localFilePath = readLine()
        println("What is the hdfs path you would like to move to?")
        val hdfsPath = readLine()
        try {
            s"hdfs dfs -put $localFilePath $hdfsPath".!
        } catch {
            case e: Exception => println("Sorry was unable to move selected file.")
        }
        runHadoopTasks()
    }

    // Hive functions-------------------------------------------------

    def runHiveTasks(){
        println("What would you like to do?\n" +
        "1. Start Hive.\n" +
        "2. Go back to Hadoop Tasks.\n" +
        "3. Quit")
        val choice = readLine()
        choice match {
            case "1" => runHive()
            case "2" => runHadoopTasks()
            case "3" => System.exit(0)
            case _ => {
                println("Invalid selection")
                runHiveTasks()
            }
        }
    }


    def runHive(){
        try {
            println("Please wait starting Hive.")
            "/usr/local/Cellar/hive/3.1.2_2/libexec/bin/hive".!
        } catch {
            case e: Exception => println("Was unable to start hive.")
        }
        runHiveTasks()
    }
}