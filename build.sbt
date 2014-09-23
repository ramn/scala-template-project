import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._


name := "template-project"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.2"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-encoding", "utf8"
)

javacOptions ++= Seq("-Xlint:unchecked")

packageArchetype.java_application

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.1.2" % "test"
)
