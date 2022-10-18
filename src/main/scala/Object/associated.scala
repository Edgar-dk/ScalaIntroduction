package Object

/**
 * @author Edgar
 * @create 2022-10-15 15:13
 * @faction:
 */
object associated {
  def main(args: Array[String]): Unit = {
    /*1.把这个对象接口暴露出去，就可以拿着这个接口去操作
    *   对象里面的数据了*/
    val newStudent1 = Body1.newStudent("张三", 23)
    newStudent1.printInfo()

  }
}

/*1.私有化这个类的构造器，外界不可以直接去创建对象了*/
class Body1 private(var name:String,var age:Int){
  def printInfo(){
    println("名字："+name+"年龄："+age+"学校："+Body1.school)
  }
}

object Body1{
  var school:String="sias"
  /*01.伴生对象，直接调用对象里面的属性和方法，私有的也是可以的
  *    私有的构造器也是可以知己调用的，调用之后，然后把得到的结果按照Body1对象
  *    返回出去，外界就可以拿着这个对象去操作里面的数据和具体业务的逻辑*/
  def newStudent(name: String,age:Int):Body1=new Body1(name,age)
  def apply(name: String,age:Int):Body1=new Body1(name,age)
}