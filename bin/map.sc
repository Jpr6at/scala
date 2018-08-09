object map {
	val numeros = List(4,8,16,23,42)          //> numeros  : List[Int] = List(4, 8, 16, 23, 42)
	val dobles =  List(8,16,32,46,84)         //> dobles  : List[Int] = List(8, 16, 32, 46, 84)
	
	dobles.map{x => 2*x}                      //> res0: List[Int] = List(16, 32, 64, 92, 168)
	
	numeros.map{ _.toString().length() }      //> res1: List[Int] = List(1, 1, 2, 2, 2)
}