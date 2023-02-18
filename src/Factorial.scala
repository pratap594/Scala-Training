object Factorial {
  def main(args: Array[String]): Unit = {
    def factorial(number: Int): Int = {
      if (number == 0) 1
      else number * factorial(number - 1)
    }
    val num1 = 5
    val num2 = 0
    println(factorial(num1)) // 120
    println(factorial(num2)) // 1
  }
}
