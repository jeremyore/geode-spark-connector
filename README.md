#Spark Geode Connector

Spark Geode Connector let's you connect Spark to Geode, expose Geode regions as Spark 
RDDs, save Spark RDDs to Geode and execute Geode OQL queries in your Spark applications
and expose the results as DataFrames.

##Features:

 - Expose Geode region as Spark RDD with Geode server-side filtering
 - RDD join and outer join Geode region
 - Save Spark RDD to Geode
 - Save DStream to Geode
 - Execute Geode OQL and return DataFrame

##Version and Compatibility

Spark Geode Connector supports Spark 1.3.



##Spark 2.1.0 环境下重新编译说明



 - 1、修改 project/Dependencies spark-streaming、spark-sql 为2.1.0 版本 ，scalatest为2.11版本
 - 2、修改 project/Settings scalaVersion := "2.11.8"
 - 3、修改 geode-spark-demos/basic-demos/src/main/java/demo/OQLJavaDemo.java 中的 DataFrame 为 DataSet ，兼容 Spark 2.1.0
 - 4、修改 geode-spark-connector/src/main/java/org/apache/geode/spark/connector/javaapi/GeodeJavaSQLContextFunctions.java 
 中的 DataFrame 为 DataSet ，兼容 Spark 2.1.0
 - 5、注释掉 geode-spark-connector/src/test/scala/unittest/org/apache/geode/spark/connector/rdd/GeodeRegionRDDTest.scala 整个文件，兼容 单元测试
 - 6、兼容spark2.1.0 注释掉了geode-spark-connector/src/main/scala/org/apache/geode/spark/connector/GeodePairRDDFunctions.scala 
 def joinGeodeRegion[K2, V2]，def outerJoinGeodeRegion[K2, V2] 这两个方法
 - 7、添加 geode-spark-connector/src/main/scala/org/apache/spark/Logging.scala ，兼容 Spark 2.1.0 Logging



##Documentation
 - [Building and testing](doc/1_building.md)
 - [Quick start](doc/2_quick.md)
 - [Connect to Geode](doc/3_connecting.md)
 - [Loading data from Geode](doc/4_loading.md)
 - [RDD Join and Outer Join Geode Region](doc/5_rdd_join.md)
 - [Saving RDD to Geode](doc/6_save_rdd.md)
 - [Saving DStream to Geode](doc/7_save_dstream.md)
 - [Geode OQL](doc/8_oql.md)
 - [Using Connector in Java](doc/9_java_api.md)
 - [About the demos](doc/10_demos.md)

##License: Apache License 2.0

