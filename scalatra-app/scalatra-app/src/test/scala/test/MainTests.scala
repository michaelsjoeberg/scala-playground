package test

import org.scalatra.test.scalatest._

class MainTests extends ScalatraFunSuite {

  addServlet(classOf[Main], "/*")

  test("GET / on Main should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
