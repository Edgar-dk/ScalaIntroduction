package function

/**
 * @author Edgar
 * @create 2022-10-04 14:07
 * @faction:
 */
object anonymity {
  def main(args: Array[String]): Unit = {
    val fn = (name: String) => {
      println("name:" + name)
    }

    /*1.定义一个函数，里面的参数
    *   类型，是一个匿名函数类型的
    *
    *   把匿名函数传进来，在去调用
    *   匿名函数类型的名字，然后在把里面的
    *   数据传递到匿名函数里面，从而实现了
    *   数据固定，操作数据的函数是可以变化的
    *
    *   参数是匿名函数，String是匿名函数里面的参数，返回是是Unit*/
    def f(func: String => Unit): Unit = {
      func("sias")
    }
    /*2.可以去操作，f里面参数的形式，
    *   简化参数的样子*/
    f(fn)


    /*3.创建一个函数，这个函数的参数也是一个函数
    *   并且，写好了函数的名字，以及函数里面参数的类型，
    *   以及最后的返回值类型，然后在里面在写上数据*/
    def functionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 3)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    /*4.把计算形式传递进去，然后在计算*/
    println(functionOneAndTwo(add))
    println(functionOneAndTwo(minus))


    println("函数和数据都作为参数传递进来")

    /*5.函数和数据都作为参数传递进来"*/
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def sum(a: Int, b: Int): Int = {
      a + b
    }
    println(dualEval(sum,12,3))

    /*6.将函数，作为返回值类型返回*/
    def f2():Int=>Unit={
      def f3(a:Int):Unit={
        println("f3被调用了",a)
      }
      /*f3这个函数，本身参数类型是Int，返回类型是Unit
      * 所以在f2这个地方，参数，以及类型需要按照f3的方式来写
      * */
      f3
    }
    /*01.在调用f2的时候，结果返回的是f3这个函数，本身函数作为返回值
    *    打印的是一个对象的形式（底层是对象）*/
    var f3=f2()
    /*02.把f2赋值给一个，变量，然后在传递去一个参数
    *    就可以调用f2里面的f3函数了
    *    f3里面的结果被打印出来，本身，返回值类型是unit，所以是返回
    *    的是一个空括号*/
    println(f3(345))
    /*03.上面一个println也可以写成下面的方式*/
    println(f2()(4))
  }

}
