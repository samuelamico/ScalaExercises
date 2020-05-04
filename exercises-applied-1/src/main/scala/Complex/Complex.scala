package Complex

class Complex (a: Double, b: Double){
  val real = a
  val imaginary = b

  override def toString: String = s"$a + ${b}i"

  def +(other: Complex): Complex = {
    new Complex(other.real + this.real, other.imaginary + this.imaginary)
  }

  def +(other: Double): Complex = {
    new Complex(other + real,imaginary)
  }

  def -(other: Complex): Complex = {
    new Complex(other.real - this.real, other.imaginary - this.imaginary)
  }

  def -(other: Double): Complex = {
    new Complex(other - real,imaginary)
  }

  def *(other: Complex): Complex = {
    new Complex(other.real * real - other.imaginary* imaginary, other.imaginary * real + imaginary * other.real)
  }

  def *(other: Double): Complex = {
    new Complex(other*real,other*imaginary)
  }

  def /(other: Complex): Complex = {
    val numerador = this*Complex(other.real,-other.imaginary)
    val denominador = other*Complex(other.real,-other.imaginary)

    new Complex(numerador.real/denominador.real,numerador.imaginary/denominador.real)
  }

}


object Complex{
  def apply(a: Double,b: Double): Complex = {
    new Complex(a,b)
  }

  def apply(i: Double): Complex = {
    new Complex(i,0)
  }

}