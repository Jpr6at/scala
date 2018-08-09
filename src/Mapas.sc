object Mapas {
  val mapa = Map(1-> "Pepito", 2->"Jorge",3->"Alfonso")
                                                  //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Pepito, 2 -> Jo
                                                  //| rge, 3 -> Alfonso)
  //Obtener las claves es con keySet
  
  mapa.keySet                                     //> res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  
  //Obtener los values
  mapa.values                                     //> res1: Iterable[String] = MapLike.DefaultValuesIterable(Pepito, Jorge, Alfons
                                                  //| o)
}