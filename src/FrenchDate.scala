import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._ /********Al poner ._ es igual que en java poner .* *********/

object FrenchDate {
  
  def main(args: Array[String]){
    
    val now = new Date
    val df = getDateInstance(LONG, Locale.US)
    println(df format now)
    
  }
  
}