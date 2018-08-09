/**
 * Tambien podemos acceder a un elemento de una clase sin parentesis esto que quiere decir que podriamos 
 * acceder a estos metodos como si fueran variables, solamente tendremos que definirlos como
 * sin argumento, es decir quitanlo el parentesis que llevan
 * 
 * ejemplo: 
 * 	con parentesis
 *  def re() = real
 *  y si queremos acceder a ellos sin parentesis tratarlos como variables seria de la siguiente
 *  forma
 *  
 *   def re = real
 */

object NumeroComplejos {
  
  def main(args: Array[String]){
    val c = new Complex(1.2, 3.4)
    println("Parte Imaginaria  " + c.im)
    println("Parte Real "+ c.re)
  }
}