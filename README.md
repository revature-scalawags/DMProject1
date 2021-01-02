# Project1
- [x] Install hadoop 3.3.0
- [x] Install Yarn 3.1.2
- [x] Install Hive
- [x] Get DataSet and move to hdfs
- [ ] Modify instructors word count to work with my csv file
- [x] Install MySql
- [ ] Figure out quering through Hive

> dataset question: What was the most sold game? 
> 
> dataset question 2 : What system has the most sold games? 
>  
> dataset question 3 : What year did the most games get sold?  

## Tech Stack
> XCode Developer Tools
> Hadoop 3.3.0  
> Hive 3.1.2   
> Scala 2.13.4  
> MySql 8.0.22   
> JDK 11.0.9
> JDBC Connector 8.0.22

## Install Stack order
// If you get an invalid compiler error when doing brew install scala, do step one  otherwise skip step one.
1. Install XCode Developer Tools  
//  https://ma.ttias.be/mac-os-xcrun-error-invalid-active-developer-path-missing-xcrun/
2. > $ brew install scala  
3. Install JDK 11.0.9  
//  https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
4. install homebrew // only on mac   
//  https://docs.brew.sh/Installation. 
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
http://davidiscoding.com/quey-data-stored-in-hdfs-with-hive


# Run Program
## 1. Run Hadoop and Yarn
> $ hstart
## 2. Create folders in hdfs  
> $ hdfs dfs -mkdir /user  
> $ hdfs dfs -mkdir /input  
> $ hdfs dfs -mkdir /output   
## 3. Move dataset to hdfs input folder  
> $ hdfs dfs -put [full path to local dataset] [/input]  

## 2. Run MySql
> $ brew services start mysql  
> $ mysql -u hiveuser -p  
> enter hiveuser's password  

