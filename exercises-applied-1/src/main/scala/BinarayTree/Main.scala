package BinarayTree

object Main extends App{
  val  bt = new NoEmpty(3,  new Empty, new Empty)
  //print(bt)

  val bt1 = bt incl(4)
  //print(bt1)

  val bt2 = new NoEmpty(4, new Empty, new Empty)

  val unbt = bt union bt2

  print(unbt)
}
