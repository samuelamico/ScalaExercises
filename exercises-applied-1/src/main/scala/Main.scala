

object Main extends App{
  //println(Mod2.ListConcat.concatelist("Hello",", ","World") )

  //println(Mod2.ListConcat.nth(0,List(1, 2, 3, 4, 5, 6)))

  //println(Mod2.ListConcat.length(List(1,2,3,4)))

  //println(Mod2.ListConcat.reverse(List(1,2,3,4,5)))

  //println(Mod2.ListConcat.flatten(List(5,List(1,2))))

  //println(Mod2.ListConcat.compress(List(5,5,3,1,2)))

  //println(PureFunctions.FunPure.nth(List(2,3,4,3,2,1),3))
  //val k = Complex(1,2)
  //println(k)

  //val j = Complex(1)
  //println(j)

  //println(j + k)
  //println(k + 2)

  //println(j*j)

  //println(j/k)


  //println(Mod2.ListConcat.slice(6, 4, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  //println(Mod2.ListConcat.pack(List("a","b","c")))

  //println(Mod2.ListConcat.split(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  //println(Mod2.ListConcat.rangeList(4,6))

  //println(Mod2.ListConcat.randomSelect(3,List(1,2,3,4,5,6)))

  //println(Mod2.ListConcat.lotto(6,49))



  val result = Mod2.ListConcat.isPrime(7) match {
    case None => println("Number is not valid Int")
    case Some(i) => println(i)
  }


}
