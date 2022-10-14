package function

/**
 * @author Edgar
 * @create 2022-10-02 15:56
 * @faction:
 */
object parameter {
  def main(args: Array[String]): Unit = {
    parameter.number(12, "fgsg")
    parameter.f(age = 124)
    println(parameter.f1("gdf"))
    println("==============================")
    println(parameter.f2("gdgdgdgdgdgdg"))
  }

  def number(age: Int, address: String, name: String*): Unit = {
    println("age:" + age + "   address:" + address + "   name:" + name)
  }

  def f(name: String = "gd", age: Int): Unit = {
    println("name:" + name + "    age:" + age)
  }
  def f1(name:String):String={
//    println("name:"+name)
    name
  }
  def f2(name:String): Unit ={
    println(name)
    name
  }
}
