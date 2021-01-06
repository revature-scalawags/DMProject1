// package Project1

// SET hivevar:NUMBER = 'SUM(
//     videogameTable.NA_Sales + 
//     videogameTable.EU_Sales + 
//     videogameTable.JP_Sales + 
//     videogameTable.Other_Sales + 
//     videogameTable.Global_Sales) +
//     '

// INSERT OVERWRITE DIRECTORY '/user/output' 
// row format delimited fields terminated by '\t' 
// stored as textfile
// SELECT name 
// FROM userdb.videogameTable 
// ORDER BY ${hivevar:NUMBER};




// INSERT OVERWRITE DIRECTORY '/user/output2/mostSoldGame' 
//     row format delimited 
//     fields terminated by '\t' 
//     SELECT name, 
//     SUM(global_sales) AS total_sales
//     FROM userdb.videogame
//     GROUP BY name
//     SORT BY total_sales DESC;

// INSERT OVERWRITE DIRECTORY '/user/output2/platformWithMostSoldGames'
//     row format delimited
//     fields terminated by '\t'
//     SELECT platform,
//     SUM(global_sales) AS total_sales
//     FROM userdb.videogame
//     GROUP BY platform
//     SORT BY total_sales DESC;

// INSERT OVERWRITE DIRECTORY '/user/output2/yearWithMostSales'
//     row format delimited
//     fields terminated by '\t'
//     SELECT year,
//     SUM(global_sales) AS total_sales
//     FROM userdb.videogame
//     GROUP BY year
//     SORT BY total_sales DESC;