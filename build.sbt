ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "smart-calendar-with-zio"
  )

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ymacro-annotations",
  "-Wconf:cat=unused-imports:info,"
)

libraryDependencies ++= Dependencies.all
