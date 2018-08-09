object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(30); 

	var k = 0;System.out.println("""k  : Int = """ + $show(k ));$skip(65); 
	/**While**/
	while (k<20){
		println(s"K vale ${k}")
		k+=1
 	};$skip(7); 
 	k =0;$skip(54); 
 	do{
 		println(s"K vale $k")
		k+=1
 	}while(k<=20)}
}
