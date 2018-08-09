/*
 * Una de las diferencias de las clases en Java vs Scala es que las clases en Scala pueden contener
 * parametros 
 */

class Complex(real: Double, imaginary: Double) {
  
  /**
   * Declaración de un metodo normalmente
   *  def re() = real
   *	def im() = imaginary
   */
  /**
   *  Declaracion de un metodo para poder acceder a ellos como si fuera variable
   */
  def re = real
  def im = imaginary
  
}