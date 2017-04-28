name := "geode-spark-connector"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++=  Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.0",
  "org.apache.spark" % "spark-mllib_2.11" % "2.1.0"
  //  "org.jblas" % "jblas" % "1.2.4"
  //  "io.prediction" % "sdk" % "0.9.5" pomOnly(),
  //  "nz.ac.waikato.cms.weka" % "weka-dev" % "3.9.0",
  //  "com.twitter" % "algebird-core_2.11" % "0.12.2",
  //  "mysql" % "mysql-connector-java" % "5.1.39",
  //  "org.scalaz" %% "scalaz-core" % "7.2.8"
  //  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  //  "org.scala-lang" % "scala-swing" % "2.11.0-M7"
)

//libraryDependencies += "org.apache.geode" % "geode-junit" % "1.0.0-incubating"

libraryDependencies += "org.apache.geode" % "geode-core" % "1.1.0"

//libraryDependencies += "org.apache.geode" % "geode-modules" % "1.0.0-incubating"
//
//libraryDependencies += "org.apache.geode" % "geode-common" % "1.0.0-incubating"

//libraryDependencies += "org.apache.geode" % "gemfire-core" % "1.0.0-incubating.M1"
//
//libraryDependencies += "org.apache.geode" % "gemfire-common" % "1.0.0-incubating.M1"
//
//libraryDependencies += "org.apache.geode" % "gemfire-json" % "1.0.0-incubating.M1"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.5"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.6.5"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.6.5"