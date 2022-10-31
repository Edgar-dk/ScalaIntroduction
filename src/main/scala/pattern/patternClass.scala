package pattern

/**
 * @author Edgar
 * @create 2022-10-31 10:01
 * @faction:
 */
object patternClass {
  def main(args: Array[String]): Unit = {
    /*1.在去创建对象的时候，用的是class里面的变量*/
    val alice = new Student("Plice", 23)
    /*2.创建了一个类的伴生对象桌，并且里面有apply方法，可以直接使用
    *   Student()的方式调用伴生对象里面的apply方法，下面的形式也是
    *   通过伴生对象的形式去创建对象，把数据传递过去，然后创建*/
    var result=alice match {
      case Student("Alice",23) => "Alice , 23"
      case _ => "SomeThing else"
    }
    println(result)
  }
}

class Student(val name:String, val age:Int)
object Student{
  def apply(name:String,age:Int) :Student= new Student(name,age)
  /*3.解包当alice通过模式的方式传递进去的时候，和Student进行对比，不写unapply方法
  *   的话，比较的是两个对象的地址，在伴生对象里面unapply方法存在，一个普通的对象
  *   去和伴生对象比较的时候，把普通对象传递到这个方法，把这个普通对象里面的属性拆开
  *   然后去和伴生对象里面的属性值比较，相同的话，往后执行，不同的话，在按照顺序执行*/
  def unapply(student: Student) :Option[(String,Int)] ={
    if (student==null){
      None
    }else{
      Some((student.name,student.age))
    }
  }
}