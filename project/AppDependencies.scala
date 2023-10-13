import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt._

object AppDependencies {

  val bootstrap_28_version = "7.11.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc"                  %% "bootstrap-backend-play-28" % bootstrap_28_version,
    "org.typelevel"                %% "cats-core"                 % "2.9.0",
    "com.chuusai"                  %% "shapeless"                 % "2.4.0-M1",
    "com.neovisionaries"            % "nv-i18n"                   % "1.29",
    "com.fasterxml.jackson.module" %% "jackson-module-scala"      % "2.14.2"
  )

  def test(scope: String = "test"): Seq[sbt.ModuleID] = Seq(
    "org.scalatest"         %% "scalatest"              % "3.2.15"             % scope,
    "com.vladsch.flexmark"   % "flexmark-all"           % "0.64.0"             % scope,
    "org.scalatestplus"     %% "scalacheck-1-15"        % "3.2.11.0"           % scope,
    "org.scalamock"         %% "scalamock"              % "5.2.0"              % scope,
    "com.typesafe.play"     %% "play-test"              % PlayVersion.current  % scope,
    "uk.gov.hmrc"           %% "bootstrap-test-play-28" % bootstrap_28_version % scope,
    "com.github.tomakehurst" % "wiremock-jre8"          % "2.35.0"             % scope,
    "io.swagger.parser.v3"   % "swagger-parser-v3"      % "2.1.12"             % scope
  )

}
