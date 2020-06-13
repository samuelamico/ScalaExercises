package Cap1

trait FunctionsInterface {
  def compose[A,B,C](number: A, g: B => C, f: A => B): (A => C)
  def fuse[A,B](a: Option[A], b: Option[B]): Option[(A, B)]
  def check(xs: Seq[Int])(pred: Int => Boolean): Boolean
  def permutations(x: String): Seq[String]

}
