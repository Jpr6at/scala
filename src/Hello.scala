

object Hello extends App {
  
 
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)
  def area(x:Double): Double = (3.1416 * (x * x))
  /*Funciones anonimas*/
  def str = "abc";
  
  
  def sum(f: Int => Int,a: Int, b: Int): Int = {
     def loop(a: Int, acc: Int): Int = {
       if(a > b) acc
       else loop(a + 1, f(a) + acc)
      loop(a,0)     
     }
     sum(x => x * x, 3, 5)
   }
}