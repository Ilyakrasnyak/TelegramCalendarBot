import sbt._

object Dependencies {

  lazy val config = Seq(
    "dev.zio" %% "zio-config" % "3.0.0-RC9",
    "dev.zio" %% "zio-config-magnolia" % "3.0.0-RC9",
    "dev.zio" %% "zio-config-typesafe" % "3.0.0-RC9"
  )

  lazy val zioDeps = Seq(
    "dev.zio" %% "zio" % "2.0.0-RC6",
    "dev.zio" %% "zio-managed" % "2.0.0-RC6",
    "dev.zio" %% "zio-logging" % "2.0.0-RC8",
    "dev.zio" %% "zio-interop-cats" % "3.3.0-RC7"
  )

  lazy val utils = Seq(
    "com.github.dwickern" %% "scala-nameof" % "4.0.0"
  )

  lazy val doobie = Seq(
    "org.tpolecat" %% "doobie-core" % "1.0.0-RC1",
    "org.tpolecat" %% "doobie-hikari" % "1.0.0-RC1", // HikariCP transactor.
    "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC1" // Postgres driver 42.3.1 + type mappings.
  )

  lazy val http4s = Seq(
    "org.http4s" %% "http4s-dsl" % "0.23.11",
    "org.http4s" %% "http4s-blaze-server" % "0.23.11",
    "org.http4s" %% "http4s-circe" % "0.23.11"
  )

  lazy val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % "0.14.1")

  lazy val bot4s = Seq("com.bot4s" %% "telegram-core" % "5.4.2")

  lazy val sttpClient = Seq("com.softwaremill.sttp.client3" %% "zio" % "3.6.1")

  val all: Seq[ModuleID] = zioDeps ++ utils ++ doobie ++ http4s ++ config ++ circe ++ bot4s ++ sttpClient
}
