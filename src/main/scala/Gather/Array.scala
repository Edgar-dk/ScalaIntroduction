package Gather

import scala.:+
import scala.collection.mutable.ArrayBuffer

/**
 * @author Edgar
 * @create 2022-10-16 15:00
 * @faction:
 */
object ArrayDemo {
  def main(args: Array[String]): Unit = {

    /*1.打印数组里面的数据*/
    val arr = Array(1,23)
    /*2.改变arr，1号索引位置上的数据
    *   堆里面的对象不发生变化*/
    arr(1)=90
    for (i<- arr){
      println(i)
    }

    /*3.往数组里面添加数据，会改变堆里面的对象，
    *   因此只要是添加数据，会从新创建一个新的对象，把要添加的数据放进这个新的对象
    *   里面，数据可以是前可以是后，然后在把以前旧数据复制过来一份，放在新的对象里面（堆）*/
    val newArr4 = 19 +: 29 +: arr :+ 26 :+ 73
    println(newArr4.mkString("-"))




    println("Buffer的方式去往数组中添加")
    var arrayBuffer=ArrayBuffer(1,32)
    /*1.直接在后面添加多个数据*/
    arrayBuffer.append(1,4)
    println(arrayBuffer)
    /*2.insert的时候，在执行索引1的位置上
    *   添加上数据13，59*/
    arrayBuffer.prepend(11, 76)
    arrayBuffer.insert(1, 13, 59)
    println(arrayBuffer)

    /*3.在索引2，位置插入数组，pre在前面插入数据*/
    arrayBuffer.insertAll(2, arr)
    arrayBuffer.prependAll(arr)
    // 4. 删除元素，执行索引位置上的数据
    arrayBuffer.remove(3)
    println(arrayBuffer)

    /*5.从0这个索引位置开始，往后面删除
    *   几个数据，算上这个0号索引位置上的数*/
    arrayBuffer.remove(1, 2)
    println(arrayBuffer)

    /*6.数组之间的转换*/
    val array = Array(1, 4)
    val buffer = array.toBuffer
    buffer.append(2)
    println(buffer)

    val value = Array("43","ds")
    println(value.mkString(","))

    /*7.多维数组*/
    val array1 = Array.ofDim[Int](2, 3)
    array1(1)(2)=34
    for (elem <- array1) {
      for (elem <- elem) {
        print(elem+" ")
      }
      println()
    }

  }
}
