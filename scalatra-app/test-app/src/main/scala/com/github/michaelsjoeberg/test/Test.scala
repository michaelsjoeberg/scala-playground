package com.github.michaelsjoeberg.test

import org.scalatra._

class Test extends ScalatraServlet {

    get("/") {
        views.html.hello()
    }

    get("/test") {
        views.html.hello()
    }

}
