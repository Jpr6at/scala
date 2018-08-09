import week3._
import scala.collection.immutable.Stream.Cons
 
object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(167); 
	def nth[T](n: Int, xs: List[T]): T ={
		if (n == 0) xs.head
		else nth(n - 1,  xs.tail)
	};System.out.println("""nth: [T](n: Int, xs: week3.List[T])T""");$skip(74); 
 
 val list = new Cons(1: new Cons(2: new Cons(3: new Nil)))
 nth(2,list);System.out.println("""list  : <error> = """ + $show(list ))}
}
