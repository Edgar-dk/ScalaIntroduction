package Gather

import scala.collection.mutable

/**
 * @author Edgar
 * @create 2022-10-18 14:38
 * @faction:
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    val stringToInt = Map("a" -> 34, "b" -> 56)
    /*一：操作不可变的Map*/
    /*1.打印出key和对饮的值*/
    stringToInt.foreach(println)
    /*2.打印出全部的key*/
    println(stringToInt.keys)
    /*3.打印出key对应的值value，一般直接get得到的是some
    *   的数据，get是得到去掉some的，只剩下一个值，some的
    *   表示，可以获得值，并且打印出来，没有值的话，打印出来的
    *   是一个none*/
    println(stringToInt.get("a").get)
    /*4.在去获取key对应的value的时候，没有value的时候，获取的是默认值0*/
    println(stringToInt.getOrElse("c",0))

    /*5.可以直接这种方式去获取一个key对应的value*/
    println(stringToInt("a"))




    /*二：操作可变的Map*/
    val map = mutable.Map[String,Int]()
    /*1.添加数据*/
    map.put("p",90)
    map.put("c",89)
    /*2.根据key取出来对应的value*/
    println(map("p"))
    println(map)
    /*3.删除元素*/
    map.remove("p")
    /*4.对于更新而言，里面有这个key对应的value的话，直接修改这个value
    *   没有这个key的话，直接把这个新的插入Map集合里面*/
    map.update("o",78)
    map.update("c",8)
    println(map)
    /*5.合并Map
    *   对于可以修改的map可以合并Map集合
    *   不可以修改的，合并*/
    map ++= stringToInt
    println(map)
  }
}
