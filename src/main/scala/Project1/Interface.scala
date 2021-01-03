import CSVCreator._
import scala.io.StdIn._
import sys.process._
import scala.language.postfixOps

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
        runHadoop()
        println("What would you like to do?\n" +
        "1. Create hdfs folder.\n" +
        "2. List contents of a folder.\n" +
        "3. Remove a folder.\n" +
        "4. Move a folder.\n" +
        "5. Rename a folder.\n" +
        "6. Move a file from local system to hdfs.\n" +
        "7. Complete a hive task.\n" +
        "8. Quit")

    }
    def runHadoop(){
        sh: hstart
    }

    def runhiveTasks(){
        println("What would you like to do?\n" +
        "1. Create Database.\n" +
        "2. Remove a Database.\n" +
        "3. Create a Table.\n" +
        "4. Drop a Table.\n" +
        "5. Create a User\n" +
        "6. Go back to Hadoop Tasks.\n" +
        "7. Quit")
    }

    
    
    
    
    
    
    
    
    
    def runHive(){
        "$HIVE_HOME/bin/hive" !
    }

    def createHiveDB(dbName: String){
        s"CREATE DATABASE IF NOT EXISTS $dbName;" !
    }

    def createHiveTable(columnNames: List[String]){

    }

}