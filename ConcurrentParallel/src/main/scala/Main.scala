import Cap1._

object Main extends App{

  println(Functions.fuse(Some(1),Some(2)))

  def pred: Int => Boolean = x => x > 2

  val result = Functions.check(Seq(1,2,3,4))(pred)

  println(Functions.permutations("Chuchu"))

}

object ThreadMain extends App{

  def thread(body: => Unit): Thread = {
      val t = new Thread {
        override def run() = body
      }
      t.start()
      t
  }

  class MyThread extends Thread {
    override def run(): Unit = {
        Thread.sleep(1000)
        println("Ola Thread")
        Thread.sleep(1000)

    }
  }

  // Using this.synchronized eliminates race conditions
  var uidCount = 0L
  def getUniqueId() = this.synchronized {
    val freshUid = uidCount + 1
    uidCount = freshUid
    freshUid
  }

  def printUniqueIds(n: Int): Unit = {
    val uids = for (i<- 0 until n) yield getUniqueId()
    println(s"Generated uids: $uids")
  }



  //val thread1 = new MyThread
  val t1 = thread({printUniqueIds(5)})
  printUniqueIds(5)

  println("New thread Joined")

}