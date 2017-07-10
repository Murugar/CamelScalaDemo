package com.iqmsoft.camel.scala

import org.apache.camel.{CamelContext, Exchange}
import org.apache.camel.scala.dsl.builder.ScalaRouteBuilder


class TestRouteBuilder(override val context : CamelContext) extends ScalaRouteBuilder(context) {

   
   val testProcessorMethod = (exchange: Exchange) => {
     exchange.getIn.setBody("block scala test")
   }
   
    val testProcessorMethod1 = (exchange: Exchange) => {
     exchange.getIn.setBody("block scala test1")
   }
   
 
   "timer://test1?period=10s" ==> {
      process(testProcessorMethod)
      to("log:block")
   }
   
   "timer://test2?period=5s" ==> {
      process(testProcessorMethod1)
      to("log:block")
   }
   
}