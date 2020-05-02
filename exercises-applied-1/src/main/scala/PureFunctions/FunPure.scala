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

  def nth(x: List[Int],n: Int): Int = {
    def recursive(cont: Int, target: List[Int]): Int = {
      if (target.isEmpty) cont
      else if (target.head == n) recursive(cont+1,target.tail)
      else recursive(cont,target.tail)
    }

    recursive(0,x)
  }

  def sum(x: Int, y: Int): Int = {
    def succ(i:Int):Int = i+1
    def pred(i:Int):Int = i-1

    if (y == 0) x
    else sum(succ(x),pred(y))
  }

  def mult(x: Int,  y: Int): Int = {
    def recur(cnt: Int, result: Int): Int = {
      print(cnt,result)
      if (cnt == 1) result
      else recur (cnt - 1, sum (result, x) )
    }
    recur(y,x)
  }

  def exp(x: Int, y: Int): Int = {
    def recur(cnt: Int, result: Int): Int = {
      print(cnt,result)
      if (cnt == 1) result
      else recur (cnt - 1, mult (result, x) )
    }
    recur(y,x)
  }



}
