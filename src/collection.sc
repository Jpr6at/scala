object collection {
  
	var frutas = Array("Pera","Manzana","Naranja","Limon")
                                                  //> frutas  : Array[String] = Array(Pera, Manzana, Naranja, Limon)
	frutas.apply(3)                           //> res0: String = Limon
	frutas.isEmpty                            //> res1: Boolean = false
	frutas.nonEmpty                           //> res2: Boolean = true
	
	frutas indexOf "Pera"                     //> res3: Int = 0
	
	
}