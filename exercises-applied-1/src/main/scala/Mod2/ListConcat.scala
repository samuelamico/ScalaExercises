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
  //==================================================\\

  // P05
  // Reverse a list.
  def reverse[A](vec: List[A]): List[A] = {
    def recursive[A](target: List[A], goal: List[A]): List[A] = (target,goal) match {
      case (Nil,_) => goal
      case (head :: tail,goal) => recursive(tail, head :: goal)
    }
    if(vec.isEmpty) throw new NoSuchElementException
    else recursive(vec,Nil)
  }

  //==================================================\\

  // P06
  // Palidrome.
  def isPalindrome[A](vec: List[A]): Boolean = {
    def recursive[A](target: List[A], goal: List[A]): List[A] = (target,goal) match {
      case (Nil,_) => goal
      case (head :: tail,goal) => recursive(tail, head :: goal)
    }
    if(vec.isEmpty) throw new NoSuchElementException
    else{
      if (recursive(vec,Nil) == vec) true
      else false
    }
  }

  //==================================================\\

  // P07
  // flatten a List.
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
  //==================================================\\

  // P08
  // Compress.
  def compress[A](vec: List[A]): List[A] = {
    def recursive[A](target: List[A], goal: List[A]): List[A] = (target) match {
      case (head :: tail) => recursive(tail.dropWhile(_ == head), head :: goal)
      case Nil => goal.reverse
    }
    recursive(vec,Nil)
  }

  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
  //==================================================\\

  // P14
  //  Duplicate the elements of a list..
  def duplicate [A](vect: List[A]): List[A] = {
    def recursive[A](target: List[A], goal: List[A]): List[A] = (target) match{
      case Nil => goal.reverse
      case (head :: tail) => recursive(tail,head :: head :: goal)
    }
    recursive(vect,Nil)
  }

  //==================================================\\

  // P14
  //  Duplicate the elements of a list..
  def duplicateN [A](n: Int, vect: List[A]): List[A] = {
    def recursive[A](cont: Int, target: List[A], goal: List[A]): List[A] = {
      if(target.isEmpty){
        goal.reverse
      }else{
        if(cont == n) recursive(0,target.tail,goal)
        else recursive(cont+1,target,target.head :: goal)
      }
    }
    recursive(0,vect,Nil)
  }


  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
}
