package BinarayTree


abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(x: IntSet): IntSet
}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NoEmpty(x, new Empty, new Empty)
  def union(x: IntSet): IntSet = x
  override def toString = "."
}

class NoEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean = {
    if(x < elem) left contains x
    else if(x > elem) right contains x
    else true
  }

  def incl(x: Int): IntSet = {
    if(x < elem) new NoEmpty(elem , left incl x, right)
    else if(x > elem) new NoEmpty(elem, left, right incl x)
    else this
  }

  def union(x: IntSet): IntSet = {
    ((left union right) union x) incl elem
  }
  override def toString = "{" + left + elem + right + "}"
}