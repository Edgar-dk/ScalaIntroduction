package CommonMethod

import scala.math.Ordered.orderingToOrdered

/**
 * @author Edgar
 * @create 2022-10-27 17:46
 * @faction:
 */
object synthesize1 {
  def main(args: Array[String]): Unit = {
    var list1=List(1,2,3,5)
    var list2=List(6,7,8,9,10)
    var list3=List(("a",1),("g",7),("c",4),("z",5))
    /*1.list1在前面的话，拉链list2的，这个时候，list1数据显示在list2的前面
    *   反之list2在前面的话，就显示在前面，在多余的数据地方，不去对应*/
    println("zip:"+list1.zip(list2))
    println("zip:"+list2.zip(list1))


    /*2.滑动窗口*/
    for (elem <- list1.sliding(2)) {
      println(elem)
    }

    /*01.使用滑动窗口，中间间隔一些数据
    *    按照规则去滑动的时候，多余的数据也会显示在列表中
    *    本质上，list2.sliding是一个迭代器，每次从里面迭代出来
    *    一个列表*/
    for (elem <- list2.sliding(2, 2)) {
      println(elem)
    }

    /*3.基本运算*/
    println(list1.sum)
    println(list1.max)
    println(list1.min)
    println(list1.product)
    /*01.列表里面元祖的方式去比较的话，默认比较的是第一个元组字符的大小
    **/
    println(list3.max)
    /*02.下面比较的方式是按照比较第二个的方式，按照返回值是第二个的方式
    *    去比较数据，在倒数2，3的方式是按照简写的形式去比较数据*/
    println(list3.maxBy((tup:(String,Int)) => tup._2))
    println(list3.maxBy(_._2))
    println(list3.minBy(_._2))

    /*4.排序（普通的列表）
    *   默认按照从小到大的顺序排列
    *   使用反转的方式，直接把数据反转过来*/
    println(list2.sorted)
    println(list2.sorted(Ordering[Int].reverse))
    /*01.元组的方式去排列数据（第一种方式比较繁琐，
         第二种方式，按照第二种数据去比较，）*/
    println(list3.sortBy(_._2)(Ordering[Int].reverse))
    println(list3.sortWith( _ < _ ))


    /*5.函数的过滤
    * ，过滤掉，按照条件去执行*/
    println(list2.filter( _ % 2 == 0))
    /*01.里面的每一个数据进行*2，第二个是，每一个数乘每一个数*/
    println(list1.map(_ * 2))
    println(list1.map( x => x*x))
    /*02.扁平化，直接把一个列表中的数据，拆分开，然后在放在一个list里面，在显示出来*/
    var list4= List(List(1,2),List(3,4))
    println(list4.flatten)

    /*03.扁平映射
    *    flatMap含义是，把list5里面的数据，按照一定的方式去分割开数据
    *    每一个被分割开的数据变成一个了数组，数组外面是list包裹着，然后
    *    直接扁平化，把这些数组拆分开，把每一个数组外层的包裹（Array）去掉，
    *    把以前数组里面的数据全部放在list里面，这个就是扁平化，所谓的映射
    *    就是按照一定的方式去处理数据的时候，得到的返回值是一个数组，先映射
    *    在扁平*/
    var list5= List("hello Word","Hello Java")
    var flattenList=list5.flatMap(_.split(" "))
    println(flattenList)

    /*6.groupBy分组
    *   对list2这个列表分组，按照奇数偶数的形式去分组1是奇数，0是偶数
    *   _.charAt(0)使用分组的时候，这个是按照第一个字母去分组，首字母是
    *   这个的，就分配到一个组里面*/
    val intToInts: Map[Int, List[Int]] = list2.groupBy(_ % 2)
    println(intToInts)
    val strings: List[String] = List("china", "america", "canada", "cary", "bob", "japan")
    val charToStrings: Map[Char, List[String]] = strings.groupBy(_.charAt(0))
    println(charToStrings)

    /*7.集合转换操作
    *   执行+的时候，从左往右的方式执行
    *   第二个是从右边往左边执行的+操作*/
    val i: Int = list2.reduce(_ + _)
    println(i)
    println(list2.reduceRight(_ + _))
    /*01.默认从左边开始，第二个的方式是，6-(7-(8-(9-10)))*/
    println(list2.reduce(_ - _))
    println(list2.reduceRight(_ - _))


    /*8.fold*/
    println(list2.fold(10)(_ + _))     // 10 + 1 + 2 + 3 + 4
    println(list2.foldLeft(10)(_ - _))    // 10 - 1 - 2 - 3 - 4
    println(list2.foldRight(11)(_ - _))    // 3 - (4 - (5 - (8 - (10 - 11)))),  -5

  }
}