println("One loop inside another")

var x = 0
var y = 0

while(x < 5) {
  while(y < 5){
    println(s" $x * $y = ${x*y}")
    y+=1
  }
  y = 0
  x+=1
}


