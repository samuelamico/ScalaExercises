package Complex

class Complex (a: Int, b: Int){
  val real = a
  val imaginary = b

  override def toString: String = s"$a + ${b}i"

  def +(other: Complex): Complex = {
    new Complex(other.real + this.real, other.imaginary + this.imaginary)
  }

  def +(other: Int): Complex = {
    new Complex(other + real,imaginary)
  }

}


object Complex{
  def apply(a: Int,b: Int): Complex = {
    new Complex(a,b)
  }

  def apply(i: Int): Complex = {
    new Complex(i,0)
  }

}