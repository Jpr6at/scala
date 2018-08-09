object Mapas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  val mapa = Map(1-> "Pepito", 2->"Jorge",3->"Alfonso");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(54); val res$0 = 
  //Obtener las claves es con keySet
  
  mapa.keySet;System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(40); val res$1 = 
  
  //Obtener los values
  mapa.values;System.out.println("""res1: Iterable[String] = """ + $show(res$1))}
}
