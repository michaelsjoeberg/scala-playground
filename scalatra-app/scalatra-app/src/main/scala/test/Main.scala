package test

import org.scalatra._

class Main extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
