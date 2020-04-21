package Mod2

import Mod2.ListConcat
import org.scalatest.{FlatSpec, Matchers}

class Mod2Spec extends FlatSpec with Matchers{

    it should "Say hello word" in {
      ListConcat.concatelist("Hello",", ","World") shouldEqual("Hello, World")
    }
}
