import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._


lazy val root = Project(
  id="root",
  base=file("."),
  settings=Seq(
    name := "template-project",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq(
      "-feature",
      "-unchecked",
      "-deprecation",
      "-encoding", "utf8"
    ),
    javacOptions ++= Seq("-Xlint:unchecked"),
    resolvers += "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.2" % "test",
      "org.scalamock" %% "scalamock-scalatest-support" % "3.1.2" % "test"
    )
  )
)

packageArchetype.java_application
