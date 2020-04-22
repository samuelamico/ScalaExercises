package Mod2

object ListConcat extends ListConcateRef{

  def concatelist(x: String, y: String, z: String): String = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = x
    greetStrings(1) = y
    greetStrings(2) = z

    // what happens if you replace the above line with:
    // greetStrings(2) = 2

    // join the strings together
    val concat = greetStrings(0) + greetStrings(1) + greetStrings(2)
    concat

  }
  //==================================================\\

  // P03
  // Find the Kth element of a list.
  // By convention, the first element in the list is element 0. Use only recursive

  def nth[A](n: Int, vect: List[A]): A = (n,vect) match {
    case (0, head :: tail) => head
    case (n, head :: tail) => nth(n-1,tail)
    case (n , Nil) => throw new NoSuchElementException
  }

  def nth_2[A](n: Int, vect: List[A]): A ={
    def recur[B](y: List[B]): B ={
      if(y.length == (vect.length - n)) y.head
      else recur(y.tail)
    }
    recur(vect)
  }

  //==================================================\\

  // P04
  // Find the number of elements of a list.
  def length[A](vect: List[A]): Int = {
    def rec[A](n: Int, x: List[A]): Int = (x) match {
      case Nil => n
      case head :: tail => rec(n+1,tail)
    }
    rec(0,vect)
  }




}
