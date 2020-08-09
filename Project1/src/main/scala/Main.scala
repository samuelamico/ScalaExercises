import scala.io.StdIn._

object Main extends App {

  // Exercises:
  // 1.
  def recursiveRead(line: String, max: Option[Int] = null, min: Option[Int] = null): Unit = line match  {
    case "quit" => print(s"Max = $max , Min = $min")
    case line if(line)
    case line if(line.toInt >= max.getOrElse(0)) => recursiveRead(readLine(),line.toInt,min)
    case line if(line.toInt <= min.getOrElse(0)) => recursiveRead(readLine(),max,line.toInt)
    case line => recursiveRead(readLine(),max,min)
  }

  recursiveRead(readLine())
}
