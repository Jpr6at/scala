import scala.collection.immutable

object SetParte2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
	val set = Set(1,2,3,4,5,6,7);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(47); 
	val sset = immutable.SortedSet(1,6,4,12,7,89);System.out.println("""sset  : scala.collection.immutable.SortedSet[Int] = """ + $show(sset ));$skip(88); 
	
 /**** Crear un orden de set**/
 
 val mayorMenor = Ordering.fromLessThan[Int](_ > _);System.out.println("""mayorMenor  : scala.math.Ordering[Int] = """ + $show(mayorMenor ));$skip(70); 
 val sortedSetInverso = immutable.SortedSet.empty(mayorMenor) ++ sset;System.out.println("""sortedSetInverso  : scala.collection.immutable.SortedSet[Int] = """ + $show(sortedSetInverso ))}
}
