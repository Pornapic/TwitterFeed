name := "TwitterFeed"
organization := "com.pornapic"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.11.105",
  "com.typesafe.play" %% "play-json" % "2.8.1",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
)