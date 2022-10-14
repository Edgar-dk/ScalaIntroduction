package function

/**
 * @author Edgar
 * @create 2022-10-02 13:59
 * @faction:
 */
object definition {
  def main(args: Array[String]): Unit = {
    /*1.可以在main方法（函数）里面声明一个函数*/
    def SayHi(name: String): String = {
      println("这个是方法内部的函数"+name)
      return "fa"
    }

    /*01.对于直接调用SayHi的话（只有一个）
    *    就近原则，调用main方法里面的函数
    *    对于定义在对象里面的方法，通过对象名
    *    调用，因为这个是创建的伴生对象*/
    SayHi("yes")
    g("g")
    definition.SayHi("yes")
  }

  /*1.一般定义方法的时候，直接在对象
  *   内部去定义，就是一个方法，对于函数而言
  *   在方法中定义*/
  def SayHi(name: String): Unit = {
    println("这个是对象内部的方法")
  }
  def g(name: String): Unit = {
    println("这个是g函数"+name)
  }
}
