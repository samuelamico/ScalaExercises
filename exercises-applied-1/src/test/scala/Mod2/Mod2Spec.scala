package Mod2


import Complex.Complex
import Mod2.ListConcat
import PureFunctions.FunPure
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



    it should "Return Duplicate value in List" in {
        ListConcat.duplicate(List('a','b','c')) shouldEqual(List('a','a','b','b','c','c'))
    }

    it should "Return n * each value in List" in {
      ListConcat.duplicateN(2,List('a','b','c')) shouldEqual(List('a','a','b','b','c','c'))
    }


    it should "Return how may nth elements found in the list" in {
      FunPure.nth(List(2,3,4,3,2,1),3) shouldEqual(2)
    }

    it should "Return the sum" in {
      FunPure.sum(4,6) shouldEqual(10)
    }

    it should "Return the mult" in {
      FunPure.mult(4,6) shouldEqual(24)
    }

    it should "Return the exp" in {
      FunPure.exp(4,4) shouldEqual(256)
    }

    it should "Return the sum of Complex" in {
      Complex(1,2).toString shouldEqual("1.0 + 2.0i")
    }

    it should "Return the Slice of List" in {
      ListConcat.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual(List('d, 'e, 'f, 'g))
    }

    it should "Return the Concate of List" in {
      ListConcat.concateList(List(1,2,3),List(4,5,6)) shouldEqual(List(1,2,3,4,5,6))
    }


    it should "Return the reverse differente maner of List" in {
      ListConcat.reverseList(List(1,2,3,4)) shouldEqual(List(4,3,2,1))
    }

    it should "Return the drop element of List" in {
      ListConcat.removeElemt(List("a","b","c","d"),1) shouldEqual(List("a","c","d"))
    }

    it should "Return the pack consecutive of List" in {
      ListConcat.packConsecutive(List("a","a","a","b","c","c","a")) shouldEqual(List(List("a","a","a"),List("b"),List("c","c"),List("a")))
    }

    //it should "Return the encode consecutive of List" in {
     // ListConcat.encode(List("a","a","a","b","c","c","a")) shouldEqual(List((3,"a"),(1,"b"),(2,"c"),(1,"a")))
    //}

    it should "Return the encode consecutive of List" in {
      ListConcat.encode(List("a","a","a","b","c","c","a")) shouldEqual(List((4,"a"),(2,"c"),(1,"b")))
    }

    it should "Return the encode consecutive of List" in {
      ListConcat.encode(List("a","a","a","b","c","c","a")) shouldEqual(List((4,"a"),(2,"c"),(1,"b")))
    }
}
