import org.apache.spark.sql.SparkSession

object Foo extends App {
//  val spark = SparkSession.builder()
//    .config("spark.master", "local")
//    .appName("hello")
//    .getOrCreate()
//
//  println("hello world")

  println(sys.env("foo"))

  println(sys.env("bar"))
}
