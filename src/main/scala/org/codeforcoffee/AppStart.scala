package org.codeforcoffee

import akka.actor.{ActorSystem, Props}
import akka.event.Logging
import akka.io.IO
import spray.can.Http


object AppStart extends App {
  //import scala.concurrent.ExecutionContext.Implicits.global
  implicit val system = ActorSystem("random-planet")
  val log = Logging(system, getClass)

  val listener = system.actorOf(Props[HtmlServiceActor], name = "get-planet-service")

  IO(Http) ! Http.Bind(listener, interface = "localhost", port = 42001)
}