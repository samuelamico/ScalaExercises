package PureFunctions

object FunPure extends FunctionsRef{

  def baskara(a: Double, b: Double, c: Double): Unit = {
    val delta = math.sqrt(b*b - 4*a*c)
    if(delta < 0){
      // complex
      println(s" Complex root = ${(-b+delta)/(2*a)} , ${(-b-delta)/(2*a)} ")

    }
    else if(delta > 0){
      // real
      println(s" Real root = ${(-b+delta)/(2*a)} , ${(-b-delta)/(2*a)} ")
    }
    else{
      // equal
      println(s" One root = ${(-b)/(2*a)} ")
    }
  }


}
