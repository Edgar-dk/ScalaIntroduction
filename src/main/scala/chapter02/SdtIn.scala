package chapter02

import scala.io.StdIn

/**
 * @author Edgar
 * @create 2022-08-11 21:34
 * @faction:
 */
object SdtIn {
  def main(args: Array[String]): Unit = {
    println("请输入你的名字")
    /*01.从键盘上输入字符串*/
    val name = StdIn.readLine()
    println("请输入你的年龄")
    /*02.从键盘上输入数字*/
    val age = StdIn.readInt()
    
    /*03.在使用字符串的时候，需要在最前面加上s表示
    *    要用字符串来填充位置*/
    print(s"欢迎${age}的${name}来到sias")

  }

}
