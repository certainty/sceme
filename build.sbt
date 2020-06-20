lazy val settings = commonSettings ++ scalafmtSettings ++ commandAliases

lazy val commonSettings =
  Seq(
    name := "Sceme",
    scalaVersion := "2.13.2",
    organization := "de.lisp-unleashed"
  )

lazy val scalafmtSettings = Seq(
    scalafmtOnCompile := true
 )

lazy val commandAliases =
  addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt") ++
    addCommandAlias("check", "all scalafmtSbtCheck scalafmtCheck test:scalafmtCheck")

lazy val root =
  project
    .in(file("."))
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
        library.zio,
        library.zioTest    % Test,
        library.zioTestSbt % Test
      ),
      publishArtifact := false,
      testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
    )

lazy val library =
  new {
    object Version {
      val zio = "1.0.0-RC20"
    }
    val zio        = "dev.zio" %% "zio"          % Version.zio
    val zioTest    = "dev.zio" %% "zio-test"     % Version.zio
    val zioTestSbt = "dev.zio" %% "zio-test-sbt" % Version.zio
  }

