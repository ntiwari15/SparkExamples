name := "TestScala"

version := "0.1"

scalaVersion := "2.11.1"
libraryDependencies +="org.apache.spark" % "spark-core_2.11" % "2.2.0"%"provided"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0"%"provided"
libraryDependencies +="com.microsoft.sqlserver" % "mssql-jdbc" % "6.1.0.jre8"
libraryDependencies +="com.typesafe" % "config" % "1.3.1"
libraryDependencies += "org.apache.kafka" % "kafka_2.11" % "0.8.2.1"
// https://mvnrepository.com/artifact/com.typesafe.play/play
//libraryDependencies += "com.typesafe.play" % "play_2.11" % "2.6.7"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.2"
        
