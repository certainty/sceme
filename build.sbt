import sbt.Keys.libraryDependencies

lazy val root =
  project
  .in(file("."))
  .settings(commonSettings)
  .aggregate(handrolled, graal)

lazy val graal =
  project
    .settings(
     libraryDependencies ++= commonDependencies ++ Seq(
       Dependencies.truffleApi,
       Dependencies.truffleDSL,
       Dependencies.truffleTCK,
       Dependencies.graalSDK,

       Dependencies.antlr4
     )
    ).enablePlugins(DockerPlugin)

lazy val handrolled =
  project
    .settings(
      libraryDependencies ++= commonDependencies ++ Seq(
        Dependencies.zio,
        Dependencies.parboiled,
        Dependencies.clipp,
        Dependencies.zioTest    % Test,
        Dependencies.zioTestSbt % Test,
        Dependencies.specs2  % Test
      ),
      publishArtifact := false,
      testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
    ).enablePlugins(DockerPlugin)

lazy val Dependencies =
  new {
    object Version {
      val zio = "1.0.0-RC20"
      val specs2 = "4.10.0"
      val parboiled =  "2.1.8"
      val clipp = "0.3.1"
      val graalVm = "1.0.0-rc7"
      val truffle = "20.1.0"
      val antrl4 = "4.8"
    }

    val zio        = "dev.zio" %% "zio"          % Version.zio
    val zioTest    = "dev.zio" %% "zio-test"     % Version.zio
    val zioTestSbt = "dev.zio" %% "zio-test-sbt" % Version.zio
    val parboiled  = "org.parboiled" %% "parboiled" % Version.parboiled
    val clipp      = "io.github.vigoo" %% "clipp-zio" % Version.clipp
    val specs2     = "org.specs2" %% "specs2-core" % Version.specs2

    // truffle
    val truffleApi = "org.graalvm.truffle" % "truffle-api" % Version.truffle
    val truffleDSL = "org.graalvm.truffle" % "truffle-dsl-processor" % Version.truffle
    val truffleTCK = "org.graalvm.truffle" % "truffle-tck" % Version.truffle
    val graalSDK  = "org.graalvm" % "graal-sdk" % Version.graalVm

    // antlr4
    val antlr4 = "org.antlr" % "antlr4-runtime" % Version.antrl4
  }

lazy val commonDependencies = Seq(Dependencies.specs2 % "test")

lazy val scalafmtSettings = Seq(
  scalafmtOnCompile := true
)

lazy val commonSettings = scalafmtSettings ++ commandAliases ++
  Seq(
    scalaVersion := "2.13.2",
    organization := "de.lisp-unleashed"
  )

lazy val commandAliases =
  addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt") ++
    addCommandAlias("check", "all scalafmtSbtCheck scalafmtCheck test:scalafmtCheck")
