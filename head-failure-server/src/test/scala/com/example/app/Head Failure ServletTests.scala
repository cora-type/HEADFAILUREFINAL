package com.example.app

import org.scalatra.test.scalatest._

class Head Failure ServletTests extends ScalatraFunSuite {

  addServlet(classOf[Head Failure Servlet], "/*")

  test("GET / on Head Failure Servlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
