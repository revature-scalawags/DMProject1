// package Project1


// import java.sql.Connection
// import scala.collection.mutable.ListBuffer
// import java.sql.ResultSet
// import java.sql.PreparedStatement

// object VGSaleDAOImpl {
   
   
//    def getAllVGSales(): List[VGSale]={
//        val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con
//             val query: String = "SELECT * FROM userdb.videogameTable"
//             val stmt = con.createStatement()
//             val rs: ResultSet = stmt.executeQuery(query)
//             println(rs)
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList

//    }
//    def getVGSalesByName(name: String): List[VGSale]={
//        val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE name LIKE ?")
//             stmt.setString(1, name)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList

//    }
//    def getVGSalesByPlatform(platform: String): List[VGSale]={
//        val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE platform LIKE ?")
//             stmt.setString(1, platform)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//    }
//    def getVGSalesByYear(year: Int): List[VGSale]={
//        val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE year=?")
//             stmt.setInt(1, year)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByGenre(genre: String): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE genre=?")
//             stmt.setString(1, genre)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByPublisher(publisher: String): List[VGSale] ={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE publisher LIKE ?")
//             stmt.setString(1, publisher)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByLessThanEqualNA_Sales(na_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE na_Sales <= ?")
//             stmt.setDouble(1, na_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByGreaterThanOrEqualNA_Sales(na_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE na_Sales >= ?")
//             stmt.setDouble(1, na_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByLessThanEqualEU_Sales(eu_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE eu_Sales <= ?")
//             stmt.setDouble(1, eu_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByGreaterThanEqualEU_Sales(eu_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE eu_Sales >= ?")
//             stmt.setDouble(1, eu_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByGreaterThanEqualJP_Sales(jp_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE jp_Sales >= ?")
//             stmt.setDouble(1, jp_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByLessThanEqualJP_Sales(jp_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE jp_Sales <= ?")
//             stmt.setDouble(1, jp_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByGreaterThanEqualOther_Sales(other_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE other_Sales >= ?")
//             stmt.setDouble(1, other_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByLessThanEqualOther_Sales(other_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//        try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE other_Sales <= ?")
//             stmt.setDouble(1, other_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByLessThanEqualGlobal_Sales(global_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//         try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE global_Sales <= ?")
//             stmt.setDouble(1, global_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     def getVGSalesByGreaterThanEqualGlobal_Sales(global_Sales: Double): List[VGSale]={
//         val vgSales = ListBuffer[VGSale]()
//         try{
//             var con = DAOUtil.con 
//             val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM userdb.videogameTable WHERE global_Sales >= ?")
//             stmt.setDouble(1, global_Sales)
//             val rs: ResultSet = stmt.executeQuery()
//             while(rs.next()){
                
//                 var rank: Int = rs.getInt("rank")
//                 var name: String = rs.getString("name")
//                 var platform: String = rs.getString("platform")
//                 var year: Int = rs.getInt("year")
//                 var genre: String = rs.getString("genre")
//                 var publisher: String = rs.getString("publisher")
//                 var na_Sales: Double = rs.getDouble("na_Sales")
//                 var eu_Sales: Double = rs.getDouble("eu_Sales")
//                 var jp_Sales: Double = rs.getDouble("jp_Sales")
//                 var other_Sales: Double = rs.getDouble("other_Sales")
//                 var global_Sales: Double = rs.getDouble("global_Sales")

//                 val sale = new VGSale()
//                 sale.set_Rank(rank)
//                 sale.set_Name(name)
//                 sale.set_Year(year)
//                 sale.set_Genre(genre)
//                 sale.set_Publisher(publisher)
//                 sale.set_Na_Sales(na_Sales)
//                 sale.set_Eu_Sales(eu_Sales)
//                 sale.set_Jp_Sales(jp_Sales)
//                 sale.set_Other_Sales(other_Sales)
//                 sale.set_Global_Sales(global_Sales)

//                 vgSales += sale
//             }
//             rs.close()
//         } catch {
//            case e: Exception => e.printStackTrace()
//         }
//         vgSales.toList
//     }
//     // def getVGsaleByRank(id: Int): VGSale={
//     //     var sale: VGSale = VGSale
//     //     try{
//     //         con 
//     //         val stmt: PreparedStatement = con.prepareStatement("SELECT * FROM videogameTable WHERE id=?")
//     //         stmt.setDouble(1, id)
//     //         val rs: ResultSet = stmt.executeQuery()    
//     //             var rank: Int = rs.getInt("rank")
//     //             var name: String = rs.getString("name")
//     //             var platform: String = rs.getString("platform")
//     //             var year: Int = rs.getInt("year")
//     //             var genre: String = rs.getString("genre")
//     //             var publisher: String = rs.getString("publisher")
//     //             var na_Sales: Double = rs.getDouble("na_Sales")
//     //             var eu_Sales: Double = rs.getDouble("eu_Sales")
//     //             var jp_Sales: Double = rs.getDouble("jp_Sales")
//     //             var other_Sales: Double = rs.getDouble("other_Sales")
//     //             var global_Sales: Double = rs.getDouble("global_Sales")

//     //             val sale = new VGSale()
//     //             sale.set_Rank(rank)
//     //             sale.set_Name(name)
//     //             sale.set_Year(year)
//     //             sale.set_Genre(genre)
//     //             sale.set_Publisher(publisher)
//     //             sale.set_Na_Sales(na_Sales)
//     //             sale.set_Eu_Sales(eu_Sales)
//     //             sale.set_Jp_Sales(jp_Sales)
//     //             sale.set_Other_Sales(other_Sales)
//     //             sale.set_Global_Sales(global_Sales)

                
                
//     //         }
//     // }

//     // def createVGSale(sale: VGSale): Boolean
//     // def UudateVGSale(sale: VGSale): Boolean
//     // def deleteVGSale(sale: VGSale): Boolean
   

// }