name := "sbts3"

description := "S3 Plugin for sbt"

version := "0.10"

isSnapshot := false

organization := "com.simacan"

organizationName := "Janga"

sbtPlugin := true

startYear := Some(2013)

libraryDependencies ++= Seq("com.amazonaws" % "aws-java-sdk-s3" % "1.11.340",
                            "commons-lang" % "commons-lang" % "2.6")

scalacOptions in (Compile, doc) ++=
  Opts.doc.title(name.value + ": " + description.value) ++
  Opts.doc.version(version.value) ++
  Seq("-doc-root-content", (sourceDirectory.value / "main/rootdoc.txt").getAbsolutePath())

crossSbtVersions := Seq("0.13.17", "1.1.5")

licenses += ("BSD", url("http://directory.fsf.org/wiki/License:BSD_4Clause"))

val maplinkUtils = (project in file("."))
  .enablePlugins(ParentPlugin)

compilerFatalWarnings := false
