object set {
	val set = Set(1,2,3,4,5,6,21,4)           //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 21, 2, 3, 4)
	set contains 4                            //> res0: Boolean = true
	set(4)                                    //> res1: Boolean = true
	
	set + 234                                 //> res2: scala.collection.immutable.Set[Int] = Set(234, 5, 1, 6, 21, 2, 3, 4)
	
	set ++ Set(9,8,7)                         //> res3: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 21, 9, 2, 7, 3, 8, 
                                                  //| 4)
	set -- Set(21,4,5)                        //> res4: scala.collection.immutable.Set[Int] = Set(1, 6, 2, 3)
	
	set intersect Set(3,5)                    //> res5: scala.collection.immutable.Set[Int] = Set(5, 3)
	
	set diff Set(3,4)                         //> res6: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 21, 2)
	
	set & Set(2,5,6)                          //> res7: scala.collection.immutable.Set[Int] = Set(5, 6, 2)
	
	set | Set(3,4)                            //> res8: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 21, 2, 3, 4)
	
	set &~ Set(4,3)                           //> res9: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 21, 2)
	
	
}