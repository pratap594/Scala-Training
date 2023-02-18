object Anagram {
  def main(args: Array[String]): Unit = {
    def isAnagram(firstWord: String, secondWord: String): Boolean = {
      val sortFirst = firstWord.sorted
      val sortSecond = secondWord.sorted
      sortFirst == sortSecond
    }

    val name = "pratap"
    val name2 = "sahoo"
    val name3 = "listen"
    val name4 = "silent"
    println(isAnagram(name, name2)) // false
    println(isAnagram(name3, name3)) // true
  }
}
