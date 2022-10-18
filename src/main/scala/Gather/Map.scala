package Gather

/**
 * @author Edgar
 * @create 2022-10-18 14:38
 * @faction:
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    val stringToInt = Map("a" -> 34, "b" -> 56)
    /*1.打印出key和对饮的值*/
    stringToInt.foreach(println)
    /*2.打印出全部的key*/
    println(stringToInt.keys)
    /*3.打印出key对应的值value，一般直接get得到的是some
    *   的数据，get是得到去掉some的，只剩下一个值，some的
    *   表示，可以获得值，并且打印出来，没有值的话，打印出来的
    *   是一个none*/
    println(stringToInt.get("a").get)
    /*4.在去获取key对应的value的时候，没有value的时候，获取的是默认值0*/
    println(stringToInt.getOrElse("c",0))

  }
}
