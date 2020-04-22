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
}
