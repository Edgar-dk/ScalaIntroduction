package Object

/**
 * @author Edgar
 * @create 2022-10-14 14:33
 * @faction:
 */
object Controtuct {
  def main(args: Array[String]): Unit = {
    /*1.在一个对象后面不写构造器里面的参数化，默认调用的是
    *   无参数的构造器*/
    val student = new student()

    val student1 = new student("张三")

    /*2.先去调用主的，然后在调用第一个辅助的
    *   第二个辅助的值，会影响第一个辅助里面的参数值
    *   例如，下面第二个的name是王五，在去调用第一个辅助的时候
    *   name也变成了王五，不会使用第一个name的张三*/
    val student2 = new student("王五",34)

  }
}

/*1.在一个类后面直接写上一个括号，就表示这个是一个主构造器
*   有一个主构造器，多个辅助构造器，辅助构造器间接或者直接的
*   的方式调用主构造器*/
class student(){
  var name:String=_
  var age:Int=_
  println("1.定义了一个主构造器")

  /*2.定义一个辅助构造器*/
  def this(name:String){
    this
    this.name=name
    println("2.辅助构造器1被调用"+name)
  }

  def this(name:String,age:Int){
    this(name)
    this.age=age
    println("3.辅助构造器2被调用"+name+" "+age)
  }

}
