package week5
import math.Ordering
object mergesort {
  def msort[T](xs: List[T])(implicit ord:Ordering[T]) : List[T] = {
  	val n = xs.length / 2
  	if(n == 0) xs
  	else {
  		def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match{
  			case(Nil, ys) => ys
  			case(xs, Nil) => xs
  			case (x:: xs1, y :: ys1) =>
  				if (ord.lt(x, y)) x :: merge(xs1,ys)
  				else y :: merge(xs, ys1)
  		}
  		
  		val (fst, snd) = xs splitAt n
  		merge(msort(fst)(ord), msort(snd)(ord))
  	}
  }                                               //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]
  
  val nums = List(2,-5,5,-12,1)                   //> nums  : List[Int] = List(2, -5, 5, -12, 1)
  val fruits = List("apple","pineapple","orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
  msort(nums)(Ordering.Int)                       //> res0: List[Int] = List(-12, -5, 1, 2, 5)
  msort(fruits)(Ordering.String)                  //> res1: List[String] = List(apple, banana, orange, pineapple)
}