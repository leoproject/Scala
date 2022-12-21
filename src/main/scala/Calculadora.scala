import scala.util.Try

class Calculadora{
  def soma(x: Int, y: Int): Int = x+y
  def sub(x:Int , y: Int): Int = x-y
  def multplicacao(x: Int, y: Int): Int = x*y
  def div( x: Int, y: Int): Int = Try(x/y).getOrElse(0)

  def + : ( Int, Int) => Int = soma _
  def - : ( Int, Int) => Int = sub _
  def * : ( Int, Int) => Int = multplicacao _
  def / : ( Int, Int) => Int = div _

}
