package org.codeforcoffee
import spray.json.JsonParser

import scala.io.Source

object KeplerDataService {

  private val workingDirectory = new java.io.File(".").getAbsolutePath

  def loadJSON(jsonFileName: String = "kepler.json") = {
    val jsonFile = loadKeplerData(jsonFileName)
    val data = JsonParser(jsonFile)
    data
  }

  private def loadKeplerData(jsonFileName: String): String = {
    val loc = workingDirectory.dropRight(1) + jsonFileName
    val lines = Source.fromFile(loc).mkString
    lines
  }

}
