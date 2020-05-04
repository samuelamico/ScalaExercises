package Complex

class Complex (a: Int, b: Int){
  val real = a
  val imaginary = b

  override def toString: String = s"$a + ${b}i"

}


object Complex{
  def apply(a: Int,b: Int): Complex = {
    new Complex(a,b)
  }

}