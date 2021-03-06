import Cap1._
import scala.collection._

object Main extends App{

  println(Functions.fuse(Some(1),Some(2)))

  def pred: Int => Boolean = x => x > 2

  //val result = Functions.check(Seq(1,2,3,4))(pred)

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
  //val t1 = thread({printUniqueIds(5)})
  //printUniqueIds(5)


  // ================ Monitors and synchronization ================
  private val transfers = mutable.ArrayBuffer[String]()
  def logTransfer(name: String, n: Int) = transfers.synchronized {
    transfers += s"transfer to account '$name' = $n"
  }
  class Account(val name: String, var money: Int)
  def add(account: Account, n: Int) = account.synchronized {
    account.money += n
    if (n > 10) logTransfer(account.name, n)
  }
  val jane = new Account("Jane", 100)
  val john = new Account("John", 200)
  val t1 = thread { add(jane, 5) }
  val t2 = thread { add(john, 50) }
  val t3 = thread { add(jane, 70) }
  t1.join(); t2.join(); t3.join()
  println(s"--- transfers ---\n$transfers")





}