import java.util.Properties
import org.apache.spark.sql.{SparkSession, SaveMode}

object Read_Write_DB {

    def main(args: Array[String]): Unit = {

      val spark = SparkSession.builder()
        .appName("postgresql read and write")
        .master("local[*]")
        .getOrCreate()

      val sourceProps = new Properties()
      sourceProps.setProperty("user", "pratap")
      sourceProps.setProperty("password", "admin")

      //Read db data from postgresql
      val sourceDF = spark.read.jdbc("jdbc:postgresql://192.168.105:5432/foundation", "input", sourceProps)
      
      val targetProps = new Properties()
      targetProps.setProperty("user", "pratap")
      targetProps.setProperty("password", "admin")

      //write db in postgresql
      sourceDF.write.mode(SaveMode.Overwrite)
        .jdbc("jdbc:postgresql://192.168.105:5432/foundation", "output", targetProps)
    }
  }

