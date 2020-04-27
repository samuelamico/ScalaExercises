package Mod2

/**
 * The interface used by the grading infrastructure. Do not change signatures
 * or your submission will fail with a NoSuchMethodError.
 */

trait ListConcateRef {
  def concatelist(x: String, y: String, z: String): String
  def nth[A](n: Int, vect: List[A]): A
  def length[A](vect: List[A]): Int
  def reverse[A](vec: List[A]): List[A]
  def isPalindrome[A](vec: List[A]): Boolean
  def flatten(ls: List[Any]): List[Any]
  def compress[A](vec: List[A]): List[A]
  def pack[A](ls: List[A]): List[List[A]]
  def duplicate [A](vect: List[A]): List[A]
}
