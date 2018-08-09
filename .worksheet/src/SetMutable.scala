import scala.collection.mutable
object SetMutable {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  println("Welcome to the Scala worksheet");$skip(39); 
  
  val Mset = mutable.Set(1,2,3,4,5);System.out.println("""Mset  : scala.collection.mutable.Set[Int] = """ + $show(Mset ));$skip(20); val res$0 = 
  Mset ++= Set(6,7);System.out.println("""res0: SetMutable.Mset.type = """ + $show(res$0));$skip(13); val res$1 = 
  Mset  -= 7;System.out.println("""res1: SetMutable.Mset.type = """ + $show(res$1));$skip(71); val res$2 = 
  /********** FILTER SOLAMENTE OBTENEMOS UNA COPIA DEL SET ***/
 	Mset;System.out.println("""res2: scala.collection.mutable.Set[Int] = """ + $show(res$2));$skip(35); val res$3 = 
 	
 	Mset filter {x => x % 2 == 0};System.out.println("""res3: scala.collection.mutable.Set[Int] = """ + $show(res$3));$skip(7); val res$4 = 
 	Mset;System.out.println("""res4: scala.collection.mutable.Set[Int] = """ + $show(res$4));$skip(118); 
  /******RETAIN NOS PERMITE ELIMINAR DEL SET QUE NO CUMPLAN UNA CODICIÓN*******/
  
  Mset retain { x => x % 2 == 0 };$skip(7); val res$5 = 
  Mset;System.out.println("""res5: scala.collection.mutable.Set[Int] = """ + $show(res$5))}
  
  
}
