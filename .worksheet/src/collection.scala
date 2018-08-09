object collection {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  
	var frutas = Array("Pera","Manzana","Naranja","Limon");System.out.println("""frutas  : Array[String] = """ + $show(frutas ));$skip(17); val res$0 = 
	frutas.apply(3);System.out.println("""res0: String = """ + $show(res$0));$skip(16); val res$1 = 
	frutas.isEmpty;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(17); val res$2 = 
	frutas.nonEmpty;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(25); val res$3 = 
	
	frutas indexOf "Pera";System.out.println("""res3: Int = """ + $show(res$3))}
	
	
}
