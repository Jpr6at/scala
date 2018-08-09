object set {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(45); 
	val set = Set(1,2,3,4,5,6,21,4);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(16); val res$0 = 
	set contains 4;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(8); val res$1 = 
	set(4);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(13); val res$2 = 
	
	set + 234;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(21); val res$3 = 
	
	set ++ Set(9,8,7);System.out.println("""res3: scala.collection.immutable.Set[Int] = """ + $show(res$3));$skip(20); val res$4 = 
	set -- Set(21,4,5);System.out.println("""res4: scala.collection.immutable.Set[Int] = """ + $show(res$4));$skip(26); val res$5 = 
	
	set intersect Set(3,5);System.out.println("""res5: scala.collection.immutable.Set[Int] = """ + $show(res$5));$skip(21); val res$6 = 
	
	set diff Set(3,4);System.out.println("""res6: scala.collection.immutable.Set[Int] = """ + $show(res$6));$skip(20); val res$7 = 
	
	set & Set(2,5,6);System.out.println("""res7: scala.collection.immutable.Set[Int] = """ + $show(res$7));$skip(18); val res$8 = 
	
	set | Set(3,4);System.out.println("""res8: scala.collection.immutable.Set[Int] = """ + $show(res$8));$skip(19); val res$9 = 
	
	set &~ Set(4,3);System.out.println("""res9: scala.collection.immutable.Set[Int] = """ + $show(res$9))}
	
	
}
