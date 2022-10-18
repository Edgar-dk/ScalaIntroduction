package Object

/**
 * @author Edgar
 * @create 2022-10-16 11:14
 * @faction:
 */
object traitSelf {
  def main(args: Array[String]): Unit = {

  }
}

class User(var name: String, var age: Int) {

}


trait UserDao {

  /*1.下面的书写方式，UserDao的自身类型定义成了User，
  *   这个时候，就可以去使用User里面的属性和方法了。使用
  *   方式直接this.的形式，下划线可以写成this，一般是下划线*/
  _: User =>
  def insert():Unit={
    println(s"insert into table1 values ${this.name}")
  }
}