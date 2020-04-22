package Mod2

/**
 * The interface used by the grading infrastructure. Do not change signatures
 * or your submission will fail with a NoSuchMethodError.
 */

trait ListConcateRef {
  def concatelist(x: String, y: String, z: String): String
  def nth[A](n: Int, vect: List[A]): A
}
