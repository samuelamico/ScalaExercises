//Find the last but one element of a list.
//Example:
//scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5

def penultimate[A](x: List[A]): A = {
  if (x.isEmpty){
    throw new NoSuchElementException
  }
  else{
    val n = x.length
    val penult = x(n-2)
    penult
  }
}

val list = List()

println(s"Lista = $list com penultimo elemento = ${penultimate(list)} elemento")