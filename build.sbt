name := "TestScala"

version := "0.1"

scalaVersion := "2.11.1"
libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided",
  "org.apache.spark" % "spark-sql_2.11" % "2.2.0" % "provided"
  // https://mvnrepository.com/artifact/com.microsoft.azure/azure-data-lake-store-sdk
  // https://mvnrepository.com/artifact/com.microsoft.azure/azure-data-lake-store-sdk
  //"com.microsoft.azure" % "azure-data-lake-store-sdk" % "2.2.2"


)
        