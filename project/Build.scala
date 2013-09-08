package org.tritsch.scala.hello.build

import sbt._
import sbt.Keys._
import play.Project._

object PlayHelloBuild extends Build {
  val appName = "PlayHelloApp"
  val appVersion = "1.0"
  val appDependencies = Nil

  override lazy val settings = super.settings ++ Seq(
    scalaVersion := "2.10.2"
  )

  val main = play.Project(
    appName, appVersion, appDependencies
  )
}
