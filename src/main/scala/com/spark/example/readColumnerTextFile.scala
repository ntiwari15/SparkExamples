package com.spark.example


import org.apache.spark.sql.SparkSession

object readColumnerTextFile {
  def main(args: Array[String]) {
    println("Hello, world!")

    val spark = SparkSession
      .builder()
      .appName("Spark test")
        .master("local")
      .getOrCreate()


    val SourceData   = spark.read
      .format("com.databricks.spark.csv")
      .option("inferSchema", "true")
      .option("delimiter", ",")
      //.option("header", "true")
      .load("C:\\Users\\xyz\\Desktop\\temp.txt")

    SourceData.show()
    SourceData.take(2);

  }
}
