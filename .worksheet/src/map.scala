object map {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); 
	val numeros = List(4,8,16,23,42);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(35); 
	val dobles =  List(8,16,32,46,84);System.out.println("""dobles  : List[Int] = """ + $show(dobles ));$skip(24); val res$0 = 
	
	dobles.map{x => 2*x};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(40); val res$1 = 
	
	numeros.map{ _.toString().length() };System.out.println("""res1: List[Int] = """ + $show(res$1))}
}
