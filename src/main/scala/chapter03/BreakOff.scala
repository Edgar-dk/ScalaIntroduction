package chapter03

import scala.util.control.Breaks

/**
 * @author Edgar
 * @create 2022-10-02 11:51
 * @faction:
 */
object BreakOff {
  def main(args: Array[String]): Unit = {
    /*1.breakable,目的是给
    *   这个括号里面的代码标记上
    *   可以去抛出异常的，遇到一定的条件
    *   或者是，由于一个方法本身有
    *   可能发生异常，也是需要标记上的*/
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i==3){
          /*2.break是执行中断，
          *   下面的数据都不输出了
          *   分析：为什么把关键字封装在一个方法里面
          *   完全的面向对象，*/
          Breaks.break()
        }
        println(i)
      }
    )
    println("这个是外界的代码")
  }
}
