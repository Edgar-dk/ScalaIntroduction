package CommonMethod

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @author Edgar
 * @create 2022-10-28 18:33
 * @faction:
 */
object queue {
  def main(args: Array[String]): Unit = {
    /*1.默认的话，是不可以改变的队列
    *   想要在队列中增加数据的话，只可以在去创建一个队列，
    *   把以前的队列数据填充到新队列里面*/
    val strings: Queue[String] = Queue("a", "b")
    val strings1: Queue[String] = strings.enqueue("c")
    println(strings1)
    println(strings)

    /*2.可以变化的队列*/
    val strings2: mutable.Queue[String] = mutable.Queue("1", "2")
    strings2.enqueue("3")
    println(strings2)
    strings2.dequeue()
    println(strings2)
  }
}
