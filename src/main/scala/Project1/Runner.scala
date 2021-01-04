import CSVCreator._
import InterfaceMethods._
import scala.io.StdIn._

object Runner extends App{
    println("What would you like to do?\n" +
    "1. Create new dataset from existing dataset.\n" +
    "2. Run Hadoop.\n" +
    "3. Run Hive.\n" +
    "4. Quit."
    )
    val choice = readLine()
    choice match {
        case "1" => createSmallerDataSet()
        case "2" => runHadoopTasks()
        case "3" => runHiveTasks()
        case _ => 
    }
}