package Mod2
import scala.annotation.tailrec
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

  /* def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
   */
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
  //==================================================\\

  // P16
  //  Duplicate the elements of a list..
  def dropTailRecursive[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, curList: List[A], result: List[A]): List[A] = (c, curList) match {
      case (_, Nil)       => result.reverse
      case (1, _ :: tail) => dropR(n, tail, result)
      case (_, h :: tail) => dropR(c - 1, tail, h :: result)
    }
    dropR(n, ls, Nil)
  }


  //==================================================\\

  // P18
  //  Extract a slice from a list.
  def slice[T](i: Int, k: Int, vetor: List[T]): List[T] = {
    if(i > vetor.size || k > vetor.size || i > k) throw new IllegalArgumentException
    else if(i > 0) slice(i-1,k-1,vetor.tail)
    else if(k > 0) slice(i,k-1,(vetor.reverse.tail).reverse)
    else vetor
  }


  //==================================================\\

  // P09
  //  Pack list elements into sublists.
  def removelemnt[T](lista: List[T],elem: T,goal: List[T]): List[T] = {
    if(lista.isEmpty) goal
    else if(lista.head == elem) removelemnt(lista.tail,elem,goal)
    else removelemnt(lista.tail,elem,lista.head :: goal)
  }
  def findhead[T](elem: T,target: List[T], goal: List[T]): List[T] = {
      if(target.isEmpty) elem :: goal
      else if(elem == target.head) findhead(elem,target.tail,target.head :: goal)
      else findhead(elem,target.tail,goal)
  }
  def pack[T](vect: List[T]): List[List[T]] = (vect) match {
    case Nil => Nil
    case head :: tail => findhead(head,tail,Nil) :: pack(removelemnt(tail,head,Nil))
  }

  //==================================================\\
  // Concate List
  def concateList[T](xs: List[T],ys: List[T]): List[T] = xs match {
    case Nil => ys
    case h :: t => h :: concateList(t,ys)
  }

  //==================================================\\
  // Reverse List
  def reverseList[T](xs: List[T]): List[T] = xs match {
    case Nil => xs
    case h :: tail => reverseList(tail) ++ List(h)
  }

  //==================================================\\
  // Remove
  def removeElemt[T](xs: List[T], n: Int): List[T] = (xs.take(n)) ++ (xs.drop(n+1))

  //==================================================\\

  // P09**
  //  Pack consecutive duplicates of list elements into sublists.
  def packConsecutive[T](xs: List[T]): List[List[T]] = xs match{
    case Nil => Nil
    case h :: t =>
      val (first,other) = xs.span(x => x == h)
      first :: packConsecutive(other)
  }

  def encode[T](xs: List[T]): List[(Int,T)] = {
      pack(xs).map(x => (x.length,x.head))
  }

  def decode[T](lista: List[(Int, T)] ): List[T] = lista match {
    case Nil => Nil
    case x :: xs => List.fill(x._1)(x._2) ++ decode(xs)
  }

  //==================================================\\

  // P17
  //  Split a List
  def split[T](n: Int,lista: List[T]): (List[T], List[T]) = {
    @tailrec
    def splitWithAcumulator[T](m: Int, lista: List[T], ListAcum: List[T]): (List[T], List[T]) = (lista,m) match {
      case (Nil,_) => (Nil,Nil)
      case (_,0) => (ListAcum.reverse,lista)
      case (x::xs,_) => splitWithAcumulator(m-1,xs,x::ListAcum)
    }
    splitWithAcumulator(n,lista,Nil)
  }
  //==================================================\\

  // P20
  //  Insert an element at a given position into a list.
  def removeAt[T](n: Int,lista: List[T]): (List[T],T) = {
      if (n > lista.length || n <= 0) throw new IllegalArgumentException
      else (lista.take(n):::lista.takeRight(lista.length - n - 1),lista(n))
  }

  //==================================================\\

  // P21
  // Insert an element at a given position into a list.
  def insertAt[T](charc: T,n: Int,lista: List[T]): List[Any] = {
    @tailrec
    def recurAt[T](c: Int, targ: List[T], goal: List[T]): List[Any] = (targ,c) match {
      case (Nil,_) => goal.reverse
      case (x::xs,b) if(b==n) => recurAt(c+1,xs,x :: charc :: goal)
      case (x::xs,_) => recurAt(c+1,xs,x::goal)
    }
    if (n > lista.length || n <= 0) throw new IllegalArgumentException
    else recurAt(0,lista,Nil)
  }
  //==================================================\\

  // P22
  // Create a list containing all integers within a given range..
  def rangeList(a:Int,b:Int): List[Int] = {
    @tailrec
    def recurRange(c:Int,goal: List[Int]): List[Int] = (c) match {
      case x if(c > (b-a)) => goal.reverse
      case _ => recurRange(c+1,(c+a) :: goal)
    }
    if(a > b) throw new IllegalArgumentException
    else recurRange(0,Nil)
  }

  def randomSelect[T](n:Int,lista:List[T]): List[T] = (n,lista) match {
    case (n,_) if(n > lista.length) => throw new IllegalArgumentException
    case (n,_) if(n <= 0) => lista
    case (_,_) => {
      val indx = scala.util.Random
      randomSelect(n-1,removeAt(indx.nextInt(lista.length),lista)._1)
    }

  }

}
