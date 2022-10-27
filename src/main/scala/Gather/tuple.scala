package Gather

/**
 * @author Edgar
 * @create 2022-10-19 12:09
 * @faction:
 */
object tuple {
  def main(args: Array[String]): Unit = {
    /*1.创建一个元组。里面的数据最长是22个*/
    var tuple=(1,"ds",'f',false)
    /*2.打印第一个位置上的数据*/
    println(tuple._1)
    /*3.遍历元组的方式去打印数据*/
    for (elem <- tuple.productIterator) {
      println(elem)
    }
    /*4.嵌套元组
    *   第二行是打印元组里面的数据*/
    var tuple1=(1,"上海",true,(2,'d'))
    println(tuple1._4._1)
  }
}
