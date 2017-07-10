package com.iqmsoft.camel.scala

import org.apache.camel.main.Main
import org.apache.camel.scala.dsl.builder.RouteBuilderSupport


object TestRouteMain extends RouteBuilderSupport {

  def main(args: Array[String]) {
    
    val main = new Main()
   
    val context = main.getOrCreateCamelContext()
   
    main.addRouteBuilder(new TestRouteBuilder(context))
    
    main.run()
  }
}

