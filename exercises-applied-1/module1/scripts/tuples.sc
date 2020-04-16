def add_subrt(x: Int, y: Int): (Int,Int) = {
  val sm = x + y
  val st = x -y
  (sm,st)
}

val x = 10
val y = 4

val (soma,subtr) = add_subrt(x,y)

print(soma,subtr)

