# Project1
- [x] Install hadoop 3.3.0
- [x] Install Yarn 3.1.2
- [x] Install Hive
- [x] Get DataSet and move to hdfs
- [ ] Modify instructors word count to work with my csv file
- [x] Install MySql
- [x] Figure out quering through Hive

> dataset question: What was the most sold game?  WII Sport with 82
> 
> dataset question 2 : What system has the most sold games? PS2 with 644
>  
> dataset question 3 : What publisher did the most games get sold?  2008 with 334

## Tech Stack
> XCode Developer Tools
> Hadoop 3.3.0  
> Hive 3.1.2   
> Scala 2.13.4  
> MySql 8.0.22   
> JDK 8
> JDBC Connector 8.0.22
> sbt 1.4.6

## Install Stack order
// If you get an invalid compiler error when doing brew install scala, do step one  otherwise skip step one.
1. Install XCode Developer Tools  
//  https://ma.ttias.be/mac-os-xcrun-error-invalid-active-developer-path-missing-xcrun/ 
3. Install JDK 8 
//  https://java.tutorials24x7.com/blog/how-to-install-java-8-on-mac  
4. install homebrew // only on mac   
//  https://docs.brew.sh/Installation.  
4. $ brew install sbt 
5. > $  brew install hadoop   
// as of this date installs version 3.3.0.   
//  https://kontext.tech/column/hadoop/547/install-hadoop-330-on-mac. 
6. > $  brew install mysql // as of this date installs 8.0.22   
// https://tobschall.de/2020/11/01/big-sur-mamp/. 
7. > $  brew install hive // as of this date install 3.1.2. 
//  https://luckymrwang.github.io/2018/03/14/Install-hive-on-Mac-with-Homebrew/  
//  this suggests mysql 5.6.22 but we have 8.0.22.  
//  change the JDBC connector version to match the connector version you download in the next step and your hive version to match the version you installed in the previous step.
8. > Install JDBC Connector  (platform independent) // currently 8.0.22
//  https://dev.mysql.com/downloads/connector/j 

### when running mysql in terminal i got the following error  
ERROR 1045 (28000): Access denied for user 'davidmasterson'@'localhost' (using password: NO)  
//  run    
> $ mysql -u root   
  
  instead 

// ## during creation of the user you need to grant all priveleges not just the ones that step 7 has you create. You need to add these two things other wise you  will get a REFERENCES denied error. When you run the schema tool command $HIVE_HOME/bin/schematool -dbType mysql -initSchema  
> mysql> GRANT ALL PRIVILEGES ON * . * TO 'hiveuser'@'localhost';  
> mysql> FLUSH PRIVILEGES;  

## references: 
https://www.digitalocean.com/community/tutorials/how-to-create-a-new-user-and-grant-permissions-in-mysql

##### Using MySQL:
https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL

#### Using Hive  
https://www.tutorialspoint.com/hive/index.htm  
http://davidiscoding.com/quey-data-stored-in-hdfs-with-hive  
 


# Run Program  
// first thing you need to disable csrutil. IOT do this restart your mac and hold cmd and r until you see the apple and a loading bar. When recovering screen comes up click on utilites and select terminal. Type $ csrutil diaable and then restart your computer.
## 1. Run Hadoop and Yarn
> $ hstart
## 2. Create folders in hdfs  
> $ hdfs dfs -mkdir /user  
> $ hdfs dfs -mkdir /input  
> $ hdfs dfs -mkdir /output 
> $ hdfs dfs -mkdir /tmp    
## 3. Change permisions
> hdfs dfs -chmod g+w /tmp  
> hdfs dfs -chmod g+w /user/hive/warehouse
## 3. Move dataset to hdfs input folder  
> $ hdfs dfs -put [full path to local dataset] /input   
## 4. Start Hive  
> $ cd $HIVE_HOME  
> $ bin/hive  // I got a java.lang.ClassCastException when running hive. I chased this for many days uninstalling and reinstalling hadoop and Jave. I tried java 8 and still same thing. I assure you it's not anything you are doing so don't restart, There is an incompampatability between hive and Java. If interested as to why, read the following    
https://mostlymaths.net/2019/02/apache-hive-and-javalangclasscastexcept.html/  
> $ brew install azure-functions-core-tools@3  

## 2. Run MySql
> $ brew services start mysql  
> mysql > mysql -u hiveuser -p  
> enter hiveuser's password 

## Open a new terminal window and run hive.   
> $ $HIVE_HOME/bin/hive

##  (optional) 5. Turn off namenode safemode  
> $ hdfs dfsadmin -safemode leave  
// if you get an error saying that namenode is in safemode.

## Create DataBase  
> hive> CREATE DATABASE <db name >  
## Create table with columns to match your dataset 
> hive> CREATE TABLE IF NOT EXISTS <table name>(column1_name datatype, column2 ect...);
## Load dataset data into table. 
(From hdfs to Hive) 
> hive> LOAD DATA INPATH '<file path>' INTO TABLE <database>.<table>;  
(From local system to Hive)  
> hive> LOAD DATA LOCAL INPATH '<file' path>' INTO TABLE <database>.<table>;

## Execute Query  
> hive> INSERT OVERWRITE DIRECTORY '/user/output' row format delimited fields terminated by '\t' <QUERY>;

EXAMPLE QUERY:
INSERT OVERWRITE DIRECTORY '/user/output2/yearWithMostSales'
    row format delimited
    fields terminated by '\t'
    SELECT year,
    SUM(global_sales) AS total_sales
    FROM userdb.videogame
    GROUP BY year
    SORT BY total_sales DESC;



