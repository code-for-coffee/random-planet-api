package org.codeforcoffee.models

/**
  * Planet
  *
  * @param starHostname
  * @param planetLetter
  * @param orbitalPeriod
  * @param mass
  * @param radius
  * @param category
  */
case class Planet(id: Int, starHostname: String, planetLetter: String, orbitalPeriod: BigDecimal, mass: BigDecimal, radius: BigDecimal)
