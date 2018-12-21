package org.codeforcoffee

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._

class HtmlServiceActor extends Actor with HtmlService {

  def actorRefFactory = context
  def receive = runRoute(homeRoute)
}

trait HtmlService extends HttpService {
  val homeRoute =
    path("") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            <html>
              <head><title>Random Planet API</title></head>
              <body>
                <section>
                  <h1>Random Planet API</h1>
                  <p>A work in progress, to be sure.</p>
                </section>
              </body>
            </html>
          }
        }
      }
    }
}
