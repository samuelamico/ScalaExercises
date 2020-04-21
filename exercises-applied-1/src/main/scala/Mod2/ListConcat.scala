package Mod2

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



}
