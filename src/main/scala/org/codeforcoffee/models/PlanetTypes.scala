package org.codeforcoffee.models

object PlanetTypes {
  val ASTEROIDAN = {
    val minMass = 0
    val maxMass = 0.00001
    val desc = "Asteroidans are small irregular bodies (below the hydrostatic equilibrium) that are not able to hold a stable atmosphere."
  }
  val MERCURIAN = {
    val minMass = 0.00011
    val maxMass = 0.1
    val desc = "Mercurians are only able to hold a significant atmospheres in the cold zones beyond the snow line (i.e. Titan)."
  }
  val SUBTERRAN = {
    val minMass = 0.10001
    val maxMass = 0.5
    val desc = "Subterrans are able to hold a significant atmospheres after the outer edges of the habitable zone (i.e. Mars)."
  }
  val TERRAN = {
    val minMass = 0.50001
    val maxMass = 2
    val desc = "Terrans are able to hold a significant atmosphere with liquid water within the habitable zone (i.e. Earth)."
  }
  val SUPERTERRAN = {
    val minMass = 2.00001
    val maxMass = 10
    val desc = "Superterrans are able to hold dense atmospheres with liquid water within the habitable zone."
  }
  val NEPTUNIAN = {
    val minMass = 10.00001
    val maxMass = 50
    val desc = "Neptunians can have dense atmospheres in the hot zone."
  }
  val JOVIAN = {
    val minMass = 50.00001
    val maxMass = 5000
    val desc = "Neptunians can have dense atmospheres in the hot zone."
  }
}
