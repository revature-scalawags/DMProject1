import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
import scala.util.matching.Regex



object CSVCreator {

    def createCSV(fileName: String): Tuple2[List[String],List[List[String]]]={
        val lines = io.Source.fromFile(fileName).getLines()
        val headerLine = new ListBuffer[String]()
        val bodyLines = new ListBuffer[List[String]]()
        var counter = 0
        for (line <- lines) {
            if(counter == 0) {  
                val headerNames = line.split(",")
                for (col <- headerNames) {
                    headerLine += col
                }
                counter = counter + 1
            }
            else {
            val splitLine = line.split(",")
            val splitLineToList = splitLine.toList
            bodyLines += splitLineToList
            }
        }
        val headersToList= headerLine.toList
        val bodyLinesToList = bodyLines.toList
        val csvHeadersAndBody = new Tuple2(headersToList,bodyLinesToList)
        csvHeadersAndBody
        
    }

    def reduceByColumn(headersAndBody: Tuple2[List[String],List[List[String]]] , componentsOfCSV: Tuple3[Int,String,String]): Unit = {
        for (line <- headersAndBody._2 ){
            if (line(componentsOfCSV._1).toLowerCase().contains(componentsOfCSV._2)) {
                println(line)
            }
        }
    }

   
    
}