package Mod2

import Mod2.ListConcat
import org.scalatest.{FlatSpec, Matchers}

class Mod2Spec extends FlatSpec with Matchers{

    it should "Say hello word" in {
      ListConcat.concatelist("Hello",", ","World") shouldEqual("Hello, World")
    }

    it should "Return the 3th value of a List" in {
      ListConcat.nth(3,List(1, 2, 3, 4, 5, 6)) shouldEqual(4)
    }

    it should "Return the 6th value of a List" in {
      ListConcat.nth(5,List(1, 2, 3, 4, 5, 6)) shouldEqual(6)
    }

    it should "Return the length of a List" in {
      ListConcat.length(List(1, 2, 3, 4, 5)) shouldEqual(5)
    }

    it should "Return the length of a List array" in {
      ListConcat.length(List("hello","array")) shouldEqual(2)
    }

    it should "Return the reverse of a List array" in {
      ListConcat.reverse(List("hello","array")) shouldEqual(List("array","hello"))
    }

    it should "Return true if is a Palidrome" in {
      ListConcat.isPalindrome(List(1,2,3,2,1)) shouldEqual true
    }

    it should "Return false if is not a Palidrome" in {
      ListConcat.isPalindrome(List(1,2,3,1)) shouldEqual false
    }

    it should "Return flatten" in {
      ListConcat.flatten(List(1,2,3,List(4,5,6))) shouldEqual List(1,2,3,4,5,6)
    }

    it should "Return Pack" in {
      ListConcat.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    }

    it should "Return Duplicate value in List" in {
        ListConcat.duplicate(List('a','b','c')) shouldEqual(List('a','a','b','b','c','c'))
    }
}
