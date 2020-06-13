package Cap1

object Functions extends FunctionsInterface {

  def compose[A,B,C](number: A, g: B => C, f: A => B): (A => C) = ???


  def fuse[A,B](a: Option[A], b: Option[B]): Option[(A, B)] = {
    val res1 = a match {
      case Some(i) => i
    }
    val res2 = b match {
      case Some(i) => i
    }
    Some(res1,res2)
  }

  def check(xs: Seq[Int])(pred: Int => Boolean): Boolean = {
    xs.forall(pred)
  }

  def permutations(x: String): Seq[String] = {
    val result = x.split("")
    result.toSeq
  }


}
