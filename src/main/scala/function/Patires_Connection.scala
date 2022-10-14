package function

import org.junit.jupiter.api
import org.junit.jupiter.api.Test

/**
 * @author Edgar
 * @create 2022-10-13 14:45
 * @faction:
 */
object Patires_Connection {

  def main(args: Array[String]): Unit = {
    /*1.定义一个数组
    *   数组里面村你发个数据只能是int类型*/
    var arr: Array[Int] = Array(12, 3, 34, 36)

    /*2.参数是数组类型，是Int形的
    *   */
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    def addOne(elem: Int): Int = {
      elem + 1
    }

    /*3.arrayOperation里面的op:相当于外部传递进来的函数名字
    *   第一个Int相当于addOne传递进来的参数，第二个Int相当于
    *   addOne第二个Int返回值类型，直接把外部的函数传递进来，
    *   然后在把数据放进外部函数中，返回数据的时候，按照定义好
    *   的类型返回*/
    var array: Array[Int] = arrayOperation(arr, addOne)

    /*4.打印输出*/
    println(array.mkString(","))


    def practice2(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(practice2(0)("")('0'))
  }


}
