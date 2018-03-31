class firstClass{
  def test(): Unit ={
    println("First Class ")
  }
}
object firstObj{
  def main(args: Array[String]): Unit = {
    var x = new firstClass()
    x.test()
  }
}