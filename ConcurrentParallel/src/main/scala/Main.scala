import Cap1._

object Main extends App{

  println(Functions.fuse(Some(1),Some(2)))

  def pred: Int => Boolean = x => x > 2

  val result = Functions.check(Seq(1,2,3,4))(pred)

  println(Functions.permutations("Chuchu"))

}
