object Main extends App {
  println("Hello, World!")
  var x = 0
  var y = 0
  while (x < 5){
    while(y < 5){
      println(s"$x time $y is ${x * y}")
      y +=1
    }
    x += 1
    y = 0
  }
}