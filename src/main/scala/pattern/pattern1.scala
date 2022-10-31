package pattern

/**
 * @author Edgar
 * @create 2022-10-28 18:55
 * @faction:
 */
object pattern1 {
  def main(args: Array[String]): Unit = {

    /*1.模式匹配可以用在很多地方，函数地方，以及普通的变量地方*/
    var a:Int =2
    var b:Int =3
    def AB(op:Char) :Int= op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => -1
    }
    println(AB('+'))


    // 3. 模式守卫
    // 求一个整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
    println(abs(67))
    println(abs(0))
    println(abs(-24))
  }
}
