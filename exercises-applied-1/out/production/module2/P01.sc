// Find the last element of a List
// scala> last(List(1, 1, 2, 3, 5, 8))
// res0: Int = 8

def last(x: List[Int]): Int = {
  var last_number = x.last
  last_number
}

var lista= List[Int](1,1,2,3,5,8)

println(s"Minha Lista = $lista , seu ultimo elemento e ${last(lista)}")


// Lidar com qualquer tipo

def last2[A](x: List[A]): A ={
  val last = x.last
  last
}

var lista2 = List("tio","tia","pai","mae")

println(s"Minha Lista = $lista2 , seu ultimo elemento e ${last2(lista2)}")
