package pattern

/**
 * @author Edgar
 * @create 2022-10-28 18:55
 * @faction:
 */
object pattern2 {
  def main(args: Array[String]): Unit = {

    /*1.Any可以去接收任何类型的数据
    *   接收到的类型数据，匹配到下面的类型
    *   从而输出对应的数据，传进来的a自动匹配
    *   到对应类型的变量数据
    *
    *   注意：List会存在泛型擦除，往List填写的数据只根据
    *   List类型去填充进去，Array不会存在擦除，*/
    def anyType(a: Any): String = a match {
      case i: Int => "Int" + i
      case s: String => "String" + s
      case list: List[String] => "List" + list
      case array: Array[Int]=>"Array[Int]"+ array.mkString(",")
      case a => "SomeThing else:" + a
    }
    println(anyType(1))
    println(anyType("/"))
    println(anyType(List(1,2)))
    println(anyType(List("d","f")))
    println(anyType(Array(1,3,5)))
    println(anyType(Array("f","g")))
  }
}
