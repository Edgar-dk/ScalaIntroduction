package Gather

import scala.collection.mutable

/**
 * @author Edgar
 * @create 2022-10-18 12:59
 * @faction:
 */
object SetDemo {
  def main(args: Array[String]): Unit = {

    /*1.set会把里面重复的数据去重，并且打印出来的数据顺序也是乱序的*/
    val ints = Set(1,32,2,32, 3, 67)
    /*2.在一个集合里面添加一个元素，set默认是一个不可变的*/
    val ints1 =ints + 12
    println(ints1)


    /*3.两个set进行一个合并数据*/
    val ints2 = Set(23, 43, 6, 32)
    var ints3 =ints1 ++ ints2
    println(ints3)



    /*4.可变集合的操作*/
    val ints4 = mutable.Set(1, 343, 5)
    println(ints4)
    /*添加元素，在集合中有这元素的数据的话，在去添加数据，数据加不进去*/
    ints4 += 54
    println(ints4)
    ints4.add(56)
    println(ints4)
    /*删除数据*/
    ints4.remove(1)
    println(ints4)
    /*合并数据，注意在++=的左边是要改变的集合，右边的集合加给左边的
    * 集合，左边的主动去加右边的集合里面的数据*/
    val ints5 = mutable.Set(1, 45,65777)
    ints4 ++= ints5
    println(ints4)

  }
}
