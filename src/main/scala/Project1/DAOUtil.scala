// package Project1

// import java.sql.DriverManager
// import java.sql.Connection


// object DAOUtil {

//     var con: Connection = _
//     try{
//         val connectionString = "jdbc:hive2://localhost:10000/default"
//         Class.forName("org.apache.hive.jdbc.HiveDriver")
//         var con = DriverManager.getConnection(connectionString, "hive", "hive")
//     } catch {
//         case e: Exception => e.printStackTrace()
//     }
//     con.close()
// }