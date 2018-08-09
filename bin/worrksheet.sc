

object worrksheet {
  val n = 8                                       //> n  : Int = 8
  if( n == 5){
  	println("N si vale 5")
  } else if(n == 6){
  	println("No vale 5, pero si vale 6")
  }else if(n == 7){
  	println("No vale 5, ni 6, pero si vale 7")
  }else{
  	println("No n vale 5,ni 6, ni 7")
  }                                               //> No n vale 5,ni 6, ni 7
  val k = 20                                      //> k  : Int = 20
  def kVale10(): String = if(k==10) "K vale 10" else "k  no vale 10"
                                                  //> kVale10: ()String
  
  kVale10()                                       //> res0: String = k  no vale 10
  	
}