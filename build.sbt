name := """summer_project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.34",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final",  // replace by your jpa implementation
  "org.apache.commons" % "commons-email" % "1.4",
  "commons-io" % "commons-io" % "2.4",
  "com.typesafe.play" % "play-mailer_2.11" % "3.0.1",
  "junit" % "junit" % "4.11"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

//fork in run := true
