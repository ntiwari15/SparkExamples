package com.spark.example

import org.apache.spark.sql.SparkSession


object ReadParquetFileSpark {
  def main(args: Array[String]): Unit = {
    val session = SparkSession.builder().appName("SparkSubmit").getOrCreate()

    val inputFolder = args(0)
    val outputFolder =args(1)

    val ds = session.read.parquet(inputFolder)
    ds.createOrReplaceTempView("osa_data")
    val allrecords = session.sql("select emp,empName,address,phone,city,salary,deptNo from osa_data where deptNo = 50");
    val timestamp = System.currentTimeMillis();
   // println(allrecords)
    allrecords.write.json(outputFolder+"/output-"+timestamp+"/")
  }
}

