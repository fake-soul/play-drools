lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .settings(
    name := """play-java-starter-example""",
    version := "1.0-SNAPSHOT",
      scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      // Test Database
      "com.h2database" % "h2" % "1.4.199",
      // https://mvnrepository.com/artifact/org.drools/drools-core
      "org.drools" % "drools-core" % "7.6.0.Final",
      "org.drools" % "drools-compiler" % "7.31.0.Final",
      // https://mvnrepository.com/artifact/org.kie/kie-api
      "org.kie" % "kie-api" % "7.31.0.Final",
// Testing libraries for dealing with CompletionStage...
      "org.assertj" % "assertj-core" % "3.14.0" % Test,
      "org.awaitility" % "awaitility" % "4.0.1" % Test,
    ),
    javacOptions ++= Seq(
      "-encoding", "UTF-8",
      "-parameters",
      "-Xlint:unchecked",
      "-Xlint:deprecation",
      "-Werror"
    ),
    // Make verbose tests
    testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
  )
