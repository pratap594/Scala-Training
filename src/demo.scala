object demo {
  def main(args: Array[String]): Unit = {
    val number:Int = 9;
    var number1:Int = 7;
    println(number)
    println(number1)
   // number = 4; this will throw error due to immutable
    println(number)
    number1 = 8
    println(number1)

  }
}
