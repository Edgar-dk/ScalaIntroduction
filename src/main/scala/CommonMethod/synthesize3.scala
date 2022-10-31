package CommonMethod

import scala.collection.mutable

/**
 * @author Edgar
 * @create 2022-10-27 17:46
 * @faction:
 */
object synthesize3 {
  def main(args: Array[String]): Unit = {
    val strings: List[String] = List(
      "Hello Word",
      "Hello Spark",
      "Hello Flink",
      "Hello Flink"
    )
    val strings1: List[String] = strings.flatMap(_.split(" "))
    println(strings1)
    /*1.分析1：统计单词有那些，例如去统计第一个的时候，第一个Word就是第一个单词当做
    * key也就是String，在第二个Word的时候，值和第一个key相同的时候，把value放进
    * 这个key对应的list里面，然后依次往下面执行，有相同的key的话，不去创建key直接把对应
    * 的value放进这个key里面*/
    val stringToStrings: Map[String, List[String]] = strings1.groupBy(word => word)
    println(stringToStrings)
    /*2.基本分析2：
    *   分组之后，取里面value的长度，注意：在map括号后面是一个匿名函数，简写的原则*/
    val stringToInt: Map[String, Int] = stringToStrings.map(kv => {
      (kv._1, kv._2.length)
    })
    println(stringToInt)
    /*3.排序
    *   在去排序的时候，已经先将上面这个map转换成了list，只是这个list存在的形式有点不一样，这个是list
    *   里面存放的是元组形式的数据，在去比较数据，第一个_是这个元组，第二个_2是取出来，元组里面的第几个数据
    *   然后在把前三个大的数据取出来*/
    val tuples: List[(String, Int)] = stringToInt.toList.sortWith(_._2 > _._2).take(3)
    println(tuples)


    /*二：复杂形式的排序方式*/
    val TupleStrings: List[(String, Int)] = List(
      ("Hello Word", 1),
      ("Hello Spark", 2),
      ("Hello Flink", 2),
      ("Hello Flink", 4)
    )

    /*01.注意：这个flatMap对应不同的场景，使用的方式也是不一样的，在下面地方
    *    是把一个数组里面的元组先拆开，然后在以list的形式展开，*/
    val preCountList: List[(String, Int)] = TupleStrings.flatMap(
      tuple => {
        val strings: Array[String] = tuple._1.split(" ")
        val tuples1: Array[(String, Int)] = strings.map(word => (word, tuple._2))
        tuples1
      }
    )
    println(preCountList)

    /*02.求解的结果，进行分组，按照第一个字母去分组
    *    所谓的分组，就是把同样的单词放在一个list里面，list里面都是一个一个的元组
    *    在元组里面，是相同的单词，只是每一个单词是带有数字的，因为没有统计，只是单独
    *    的分组而已*/
    val stringToTuples: Map[String, List[(String, Int)]] = preCountList.groupBy(_._1)
    println(stringToTuples)

    /*03.把里面的value提取出来，然后求和
    *    tupList是list里面的一个元组信息，没有吧Map里面的那个String提取出来
    *    后面的操作.map_._2是把元组里面的第二个元素提取出来，然后在求和，提取的话，是按照
    *    相同的key操作的，相同的sum之后，在赋值给之前的tupList*/
    val stringToInt1: Map[String, Int] = stringToTuples.mapValues(
      tupList => tupList.map(_._2).sum
    )
    println(stringToInt1)

    val tuples1: List[(String, Int)] = stringToInt1.toList.sortWith(_._2 > _._2).take(3)
    println(tuples1)
  }
}

