package Object

import scala.beans.BeanProperty

/**
 * @author Edgar
 * @create 2022-10-13 9:20
 * @faction:
 */
object CreateClass {
  def main(args: Array[String]): Unit = {
    var test=new TestClass()
    test.setAge(32)
    println(test.getAge)
  }
}
class TestClass{
  @BeanProperty
  val name:String="张三"
  @BeanProperty
  var age:Int=2

}
