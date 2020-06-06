object ThreadMain extends App{

  /*
  private var uidCount= 0L
  def getUniqId(): Long = {
    uidCount = uidCount + 1
    uidCount
  }
   */

  // Using JVM syncrhronized block

  private val x = new AnyRef {}
  private var uidCount2= 0L

  def getUniqId2(): Long = x.synchronized {
    uidCount2 = uidCount2 + 1
    uidCount2
  }


  def startThread() = {
    val t = new Thread {
      override def run() {
        val uids = for(i <- 0 until 10) yield getUniqId2()
        println(uids)
      }
    }
    t.start
    t
  }

  startThread(); startThread()
}
