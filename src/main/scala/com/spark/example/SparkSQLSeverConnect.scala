package com.spark.example

import java.sql.DriverManager
import java.util.Properties

import org.apache.spark.sql.SparkSession

object SparkSQLSeverConnect {
  private val con = null

  private val url = "jdbc:sqlserver://dbname.database.windows.net:1433;"
  private val serverName = "dbname.database.windows.net"
  private val portNumber = "1433"
  private val databaseName = "dbname"
  private val userName = "username@dbname"
  private val password = "password"

  def main(args: Array[String]) {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")

    val spark = SparkSession.builder().appName("Spark test").master("local").getOrCreate()

    val query = """(select * from employee ) xyz """
    val jdbcDF = spark.read
      .format("jdbc")
      .option("url",url)
      .option("databaseName", databaseName)
      .option("dbtable",query)
      .option("user",userName )
      .option("password", password)
      .load()

    jdbcDF.show(5) //display only 5 records
  }
}
