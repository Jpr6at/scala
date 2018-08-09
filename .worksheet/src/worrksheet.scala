

object worrksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(33); 
  val n = 8;System.out.println("""n  : Int = """ + $show(n ));$skip(218); 
  if( n == 5){
  	println("N si vale 5")
  } else if(n == 6){
  	println("No vale 5, pero si vale 6")
  }else if(n == 7){
  	println("No vale 5, ni 6, pero si vale 7")
  }else{
  	println("No n vale 5,ni 6, ni 7")
  };$skip(13); 
  val k = 20;System.out.println("""k  : Int = """ + $show(k ));$skip(69); 
  def kVale10(): String = if(k==10) "K vale 10" else "k  no vale 10";System.out.println("""kVale10: ()String""");$skip(15); val res$0 = 
  
  kVale10();System.out.println("""res0: String = """ + $show(res$0))}
  	
}
