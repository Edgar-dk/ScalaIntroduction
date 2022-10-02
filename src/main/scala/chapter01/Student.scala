package chapter01

/**
 * @author Edgar
 * @create 2022-08-11 19:33
 * @faction:
 */

/*一：创建一个类*/
class Student(name:String, var age:Int) {
  def printerInfo(): Unit = {
    println(name+"  "+age+"   "+Student.school)
  }
}

/*二：创建一个伴生对象*/
object Student{
  /*1.尽管在Java中删除了static
  *   那么在scala中怎么去实现呢
  *   创建一个Student类的伴生对象，
  *   可以和Student类相互的访问里面的属性和方法，把这种类似于
  *   static的属性写在伴生对象中，可以使用对象名点方法直接调用
  *   这样的话，间接的替代了类名调用，从而体现了完全面向对象的特性
  *
  *   注意：只有在伴生对象中，可以写main方法，所以在伴生对象中写了
  *   main方法，也可以在类中直接通过伴生对象调用*/
  val school:String = "sias"
  def main(args: Array[String]): Unit = {
    var zhang = new Student("张三", 23)
    zhang=new Student("ds",23)
    zhang.age=344334
    val lisi = new Student("李四", 43)
    zhang.printerInfo()
    lisi.printerInfo()
  }
}
