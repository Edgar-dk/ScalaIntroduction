package Object

/**
 * @author Edgar
 * @create 2022-10-15 12:43
 * @faction:
 */
object Abstarct {
  def main(args: Array[String]): Unit = {
    val student = new Student1
    student.sleep()
    var op:o =new o {
      override var name: String = "434"
      override def fsd(): Unit = {
        println("这个是一个匿名抽象类")
      }
    }
  }

}

abstract class Teacher1 {

  var name: String
  val age: Int = 34;

  def eat(): Unit
  def sleep():Unit={
    println("student sleep")
  }
}

class Student1 extends Teacher1 {
  /*1.子类在去重写父类抽象属性，用var
  *   表示可以改变，不是抽象属性的用val否则编译不通过
  *   override用来标记子类里面的重写父类普通的方法*/
  var name: String = "张三"
  override val age: Int = 35
  def eat(): Unit = {
  }
  override def sleep(): Unit = {
    super.sleep()
    println("student eat")
  }
}
abstract class o{
  var name:String
  def fsd():Unit
}
