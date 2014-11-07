import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._


name := "template-project"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-encoding", "utf8"
)

javacOptions ++= Seq("-Xlint:unchecked")

packageArchetype.java_application

resolvers += "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.1.2" % "test"
)
