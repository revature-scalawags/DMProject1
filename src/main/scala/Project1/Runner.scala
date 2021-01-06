import CSVCreator._
import InterfaceMethods._
import scala.io.StdIn._

object Runner extends App{
    println("What would you like to do?\n" +
    "1. Run Hadoop.\n" +
    "2. Run Hive.\n" +
    "3. Quit."
    )
    val choice = readLine()
    
    def main(choice: String){
        choice match {
            case "1" => runHadoopTasks()
            case "2" => runHiveTasks()
            case "3" => System.exit(0)
            case _ => println("Invalid Selection")
        }
    }
    main(choice: String)
}