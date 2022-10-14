package function

import scala.annotation.tailrec

/**
 * @author Edgar
 * @create 2022-10-13 19:22
 * @faction:
 */
object factorial {
  def main(args: Array[String]): Unit = {

    def fac(n:Int):Int={
      /*1.执行第一层得到的结果传递给第二层
      *   然后第一层方法弹出，然后第二层在传递给
      *   第三层，在弹出方法*/
      def loop(n:Int,curOrder:Int):Int={
        if (n==0) return curOrder
        loop((n-1),curOrder*n)
      }
      loop(n ,1)
    }
    println(fac(5))

    println("控制抽象............")
    def f1():Int={
      println("f1被调用")
      12
    }
    /*1.在参数的位置上，a后面是一个空格
    *   然后是一个Int类型的，表示可以传递一个代码块，这个块基本上可以是任何类型的数据，只要是代码块就可以
    *   Int表示这个代码块的返回值类型，一个a就是一个代码块，在下面有几个a就代码要执行几次代码块*/
    def f2(a: =>Int):Unit={
      println("a:"+a)
      println("a:"+a)
    }
    f2(f1())



    /*2.实现while循环
    *   在myWhile后面condition这个变量是用来接收代码块的变量，并且这个代码块的变量返回值是Boolean类型的
    *   只要是下面出现了condition这个变量，就会执行一遍代码块的代码，在传递的参数位置中，{}里面的代码，是给
    *   myWhile里面那个op变量的，用来执行相关的代码的，返回值类型是Unit，只要是下面出现了op这个变量，就会执行一次
    *   这个op代码块，最里面的那个函数参数类型，以及参数最终得到结果返回值类型都作为最外面那个函数的返回值类型，写法
    *   上有些不同，参数类型需要按照代码块返回类型的方式去书写*/
    def myWhile(condition: =>Boolean): (=>Unit)=>Unit={
      def doLoop(op: =>Unit):Unit={
        if (condition){
          op
          /*01.递归的方式执行这个函数，直到一定的条件之后，执行结束*/
          myWhile(condition)(op)
        }
      }
      doLoop
    }
    var n = 10
    myWhile(n >= 1)({
      println(n)
      n -= 1
    })


  }

}
