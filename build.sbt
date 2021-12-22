name := "Hello Test #1"

version := "1.0"

scalaVersion := "2.13.7"

val AkkaVersion = "2.6.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test
)