package com.github.michaelsjoeberg.test

import org.scalatra.test.scalatest._

class TestTests extends ScalatraFunSuite {

  addServlet(classOf[Test], "/*")

  test("GET / on Test should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
