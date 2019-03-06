package com.example.app

import org.scalatra._

class headfailureserver extends ScalatraServlet {

  get("/") {
    <h1>Hello, virgin</h1>
  }

}
// cd into head-failure-server
//sbt
//jetty:start
// ~;jetty:stop;jetty:start
// to reboot the server