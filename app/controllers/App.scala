package org.tritsch.scala.hello.controllers

import play.api._
import play.api.mvc._

object App extends Controller {
  def index = Action {
    Ok(views.html.index("World"))
  }

  def name(id: String) = Action {
    Ok(views.html.index(id))
  }
}
