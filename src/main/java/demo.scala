import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object demo {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("d")
    val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()
    spark.read.json("datas/a.json").show()
  }

}
