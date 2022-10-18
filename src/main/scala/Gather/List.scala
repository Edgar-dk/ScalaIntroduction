package Gather

import scala.collection.mutable.ListBuffer

/**
 * @author Edgar
 * @create 2022-10-17 10:41
 * @faction:
 */
object ListDemo {
  def main(args: Array[String]): Unit = {

    /*一：不可以变列表*/
    val ints = List[Int](1, 34)
    println(ints)
    ints.foreach(println)

    /*1.添加元素，和不可变数组的方式一样，在后面添加一个数据
    *   会在堆内存中从新创建一个新的*/
    var list1=ints :+ 39
    println(list1)
    println(ints==list1)

    /*2.第二种添加数据的方式
    *   添加一个数，放在一个新的list前面，例如65是最右边的，先把最右边的放在一个新的list中
    *   然后在来的数，也放在这个list2列表的最前面，然后来的数，都放在最前面，第二个，以及后面的都
    *   放在这个list2列表前面，*/
    var list2=34 :: 54 :: 65 :: Nil
    println(list2)

    /*3.列表的合并*/
    val list3 = list1 ++ list2
    println(list3)
    println(list2==list3)


    /*二：可变列表*/

    val buffer = ListBuffer(1,55,7)
    buffer.append(123)
    99 +=: 88 +=: buffer += 545454 += 10
    /*2.将两个列表合并在一个，放在一个新的列表里面*/
    val buffer1=buffer ++ list1
    println(buffer1)

    val ints1 = ListBuffer(3, 4)
    val ints2 = ListBuffer(5, 6)
    /*3.两个可变列表的合并，
        ++=，list2合并到list1里面1改变，2不改变
        ++=: 是将list1的合并到2里面，2改变，1不改变*/
    ints1  ++=: ints2
    println(ints1)
    println(ints2)


  }
}

