import scala.collection.immutable

object SetParte2 {
	val set = Set(1,2,3,4,5,6,7)              //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3, 4)
	val sset = immutable.SortedSet(1,6,4,12,7,89)
                                                  //> sset  : scala.collection.immutable.SortedSet[Int] = TreeSet(1, 4, 6, 7, 12, 
                                                  //| 89)
	
 /**** Crear un orden de set**/
 
 val mayorMenor = Ordering.fromLessThan[Int](_ > _)
                                                  //> mayorMenor  : scala.math.Ordering[Int] = scala.math.Ordering$$anon$9@4909b8d
                                                  //| a
 val sortedSetInverso = immutable.SortedSet.empty(mayorMenor) ++ sset
                                                  //> sortedSetInverso  : scala.collection.immutable.SortedSet[Int] = TreeSet(89, 
                                                  //| 12, 7, 6, 4, 1)
}