import org.apache.spark.sql.SparkSession
object ReadTxtFile {
    def main(args: Array[String]): Unit = {
      val spark = SparkSession.builder()
        .appName("Read txt File")
        .master("local[*]")
        .getOrCreate()

      val inputPath = "C:\\Users\\Partap Sahu\\Desktop\\pratap.txt"

      val input = spark.read.text(inputPath)

      input.show()

      spark.stop()
    }
}
