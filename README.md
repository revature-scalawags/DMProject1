# Project1
- [x] Install hadoop 3.3.0
- [x] Install Yarn 3.1.2
- [ ] Install Hive
- [x] Get DataSet and move to hdfs
- [ ] Modify instructors word count to work with my csv file
- [x] Install MySql

> dataset question: What was the most sold game?
> dataset question 2 : What system has the most sold games? 
> dataset question 3 : What year did the most games get sold?

## Tech Stack
> Hadoop 3.3.0
> Hive
> Scala 
> HDFS
> Map Reduce
> MySql
> JDK 11.0.9

## Install Stack order
> 1.install homebrew // only on mac.  
//https://docs.brew.sh/Installation. 
> 2.brew install hadoop //as of this date installs version 3.3.0. 
//https://kontext.tech/column/hadoop/547/install-hadoop-330-on-mac. 
> 3.brew install mysql //as of this date installs 8.0.22. 
//https://tobschall.de/2020/11/01/big-sur-mamp/. 
> 4.brew install hive //as of this date install 3.1.2. 
//https://cwiki.apache.org/confluence/display/Hive/GettingStarted. 

### 1. Hadoop
add the next block to your ~/.bash_profile(if using bash) ~/.zshrc(if using zsh):8  
> * export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk-11.0.9.jdk/Contents/Home" 
* export HADOOP_HOME="/usr/local/Cellar/hadoop/3.3.0/libexec" 
* export PATH="$PATH:$HADOOP_HOME/bin" 
* export HADOOP_CONF_DIR="$HADOOP_HOME/etc/hadoop" 
>
*alias hstart="/usr/local/Cellar/hadoop/3.3.0/sbin/start-dfs.sh;/usr/local/Cellar/hadoop/3.3.0/sbin/start-yarn.sh"
* alias hstop="/usr/local/Cellar/hadoop/3.3.0/sbin/stop-yarn.sh;/usr/local/Cellar/hadoop/3.3.0/sbin/stop-dfs.sh"


## Run Hadoop and Yarn
> hstart
## Stop Hadoop and Yarn
> hstop

## Run MySql
> brew services start mysql
