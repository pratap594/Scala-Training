object Prime {
  def main(args: Array[String]): Unit = {
    def isPrime(number: Int): Boolean = {
      if (number <= 1) false
      else if (number <= 3) true
      else if (number % 2 == 0 || number % 3 == 0) false
      else {
        var i = 5
        while (i * i <= number) {
          if (number % i == 0 || number % (i + 2) == 0) return false
          i += 6
        }
        true
      }
    }

    val num1 = 7
    val num2 = 12

    println(isPrime(num1)) // true
    println(isPrime(num2)) // false

  }
}
