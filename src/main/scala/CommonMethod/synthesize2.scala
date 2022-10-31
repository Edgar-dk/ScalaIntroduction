package CommonMethod

import scala.collection.mutable
import scala.math.Ordered.orderingToOrdered

/**
 * @author Edgar
 * @create 2022-10-27 17:46
 * @faction:
 */
object synthesize2 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6,"e"->4)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    val map3 = map1.foldLeft(map2)(
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2
        /*1.分析：这个是getOrElse是去判断，mergedMap里面有没有这个key
            kv是map1里面的数据，也就是一个"a" -> 1形式的数据
        *   有的话，直接把这个key对应的value拿过来，然后去+上map1里面的value
        *   的值，在把最终的值赋值给这个key，然后返回这个mergedMap，给这个新的map*/
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      }
    )
    println(map3)
  }
}

