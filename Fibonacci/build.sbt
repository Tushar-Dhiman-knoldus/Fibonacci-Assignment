ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Fibonacci",
    idePackagePrefix := Some("com.knoldus.fibonacci")
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test