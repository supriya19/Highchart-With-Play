package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages

object Application extends Controller {

  def index = Action {
    Ok(views.html.lineChart(Messages("subheader.time_line")))
  }

  def lineChart = Action {
    Ok(views.html.lineChart(Messages("subheader.time_line")))
  }

  def columnAndBarChart = Action {
    Ok(views.html.columnAndBar(Messages("subheader.bar_column")))
  }

  def areaAndPieChart = Action {
    Ok(views.html.pieAndArea(Messages("subheader.area_pie")))
  }

  def bubbleChart = Action {
    Ok(views.html.bubble(Messages("subheader.bubble")))
  }

}