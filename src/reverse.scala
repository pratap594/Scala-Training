object reverse {
  def main(args: Array[String]): Unit = {
    val name = "pratap"
    val charArray = name.toCharArray
    val length = charArray.length
    for (i <- 0 until length / 2) {
      val temp = charArray(i)
      charArray(i) = charArray(length - 1 - i)
      charArray(length - 1 - i) = temp
    }
    val reversed = new String(charArray)
    println(reversed) //patarp
  }

}
