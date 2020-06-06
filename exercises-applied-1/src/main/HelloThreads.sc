class HelloThread extends Thread {
  override def run(): Unit ={
    println("Helo ")
    println("world")
  }
}

val t = new HelloThread
val s = new HelloThread
t.start
s.start

t.join
s.join