import scala.collection.mutable
object SetMutable {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val Mset = mutable.Set(1,2,3,4,5)               //> Mset  : scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)
  Mset ++= Set(6,7)                               //> res0: SetMutable.Mset.type = Set(1, 5, 2, 6, 3, 7, 4)
  Mset  -= 7                                      //> res1: SetMutable.Mset.type = Set(1, 5, 2, 6, 3, 4)
  /********** FILTER SOLAMENTE OBTENEMOS UNA COPIA DEL SET ***/
 	Mset                                      //> res2: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 6, 3, 4)
 	
 	Mset filter {x => x % 2 == 0}             //> res3: scala.collection.mutable.Set[Int] = Set(2, 6, 4)
 	Mset                                      //> res4: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 6, 3, 4)
  /******RETAIN NOS PERMITE ELIMINAR DEL SET QUE NO CUMPLAN UNA CODICIÓN*******/
  
  Mset retain { x => x % 2 == 0 }
  Mset                                            //> res5: scala.collection.mutable.Set[Int] = Set(2, 6, 4)
  
  
}