package chapter02

/**
 * @author Edgar
 * @create 2022-08-11 21:12
 * @faction:
 */
object String {
  def main(args: Array[String]): Unit = {
    var a = "sias"

    /*01.s""是字符串模板，可以直接
    *    用${}形式，把变量写在这里面
    *    就可以输出数据*/
    println(s"${a}学校")

    /*02.加上raw会原样的输出${}后面的数据*/
    println(raw"The num is a ${a}F")

    /*03.*/
  }


}
