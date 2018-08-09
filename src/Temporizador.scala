


object Temporizador {
  
  /****Inicio de una funcion que no tiene parametros ni regresa algo, es como una funcion void en java
   * Solamente que la diferencia de estas es (Unit) 
   */
  def unaVezPorSegundo(repite: () => Unit){
    while (true){
      repite();
      Thread sleep 1000
    }
  }
  
  def elTiempoVuela(){
    println("El tiempo pasa volando.....")
  }
  
  def main(args: Array[String]){
    
    unaVezPorSegundo(
        /*Esto es una funcion anonima es decir que no tienen un nombre*/
        () => println("El tiempo pasa volando...."))
  }
}