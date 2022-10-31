package ImplicitGenericity

/**
 * @author Edgar
 * @create 2022-10-31 10:53
 * @faction:
 */
object Base {
  def main(args: Array[String]): Unit = {

    /*1.隐士函数
    *   这中方式，是先定义一个隐士函数，然后在转换到类
    *   其实可以直接定义一个隐士类，然后用里面的方法*/
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)
    /*01.一个整数在去调用这个方法的时候，自动根据类型去找到隐士函数
    *   然后在定义到这个类里面的方法，是把12传递进去，和15比较*/
    println(12.myMax(15))

    /*2.创建隐士类
    *   一个Int类型的数据，调用方法的时候，直接按照类型匹配到那个隐士类
    *   里面的方法*/
    implicit class MyRichInt2(val self: Int) {
      // 自定义比较大小的方法
      def myMax2(n: Int): Int = if ( n < self ) self else n
      def myMin2(n: Int): Int = if ( n < self ) n else self
    }
    println(12.myMax2(15))

    /*3.隐士变量
    *   直接按照变量的类型传递进去
    *   一个String，只有一个String类型的隐士变量*/
    implicit var name:String="Alice"
    def Var (implicit name:String) : Unit= {
      println("Hello",name)
    }
    Var
  }
}

class MyRichInt(val self: Int) {
  // 自定义比较大小的方法
  def myMax(n: Int): Int = if ( n < self ) self else n
  def myMin(n: Int): Int = if ( n < self ) n else self
}