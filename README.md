#Project1
- [x] Move hadoop to containerized hadoop cluster with docker.
- [x] Install Yarn
- [ ] Install Hive
- [x] Get DataSet and move to hdfs
- [ ] Modify instructors word count to work with my csv file

> dataset question: What was the most sold game?
> dataset question 2 : What system has the most sold games? 
> dataset question 3 : What year did the most games get sold?

##Tech Stack
> Hadoop ran as container
> Hive
> Scala
> HDFS
> Map Reduce

###Run example case (WordCount)
> docker exec -it namenode bash
> hadoop jar word-count-assembly.jar input output
