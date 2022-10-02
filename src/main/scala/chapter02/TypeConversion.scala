package chapter02

/**
 * @author Edgar
 * @create 2022-08-14 20:11
 * @faction:
 */
object TypeConversion {
  def main(args: Array[String]): Unit = {
    /*    var a: Byte =2
        var b: Double = a
        /*01.强制类型转换的时候，小的到大的，哪一个出现强制转
        *    就转一个就可以了，另外一个不去处理，大的--->小的
        *    按照小的转，n.to小的类型*/
        val c: Int = b.toInt+a
        val ds: Byte=b.toByte
        var d:Char= 'd'
        var e:String = d.toString
        print(e)*/
    /*for(i <- 1 to 5){
      println("宋宋，告别海狗人参丸吧"+i)
    }*/

    for (i<- 1 to 10) {
      println(i+" p")
    }

    /*02.步长的使用*/

      for (date <- 10.0 to 30.0 by 3) {
        println(date)
      }
  }
}
