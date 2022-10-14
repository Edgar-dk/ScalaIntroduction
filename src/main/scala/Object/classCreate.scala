package Object

import scala.beans.BeanProperty

/**
 * @author Edgar
 * @create 2022-10-14 11:19
 * @faction:
 */
object classCreate {
  def main(args: Array[String]): Unit = {
    val demo = new ClassDemo()
    println(demo.age)
    demo.setAge(4)
    println(demo.age)
    println(demo.name)
  }
}

class ClassDemo{
  @BeanProperty
  var age:Int=_
  @BeanProperty
  var name:String=""
}
