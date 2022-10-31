package pattern

/**
 * @author Edgar
 * @create 2022-10-28 18:55
 * @faction:
 */
object pattern3Array {
  def main(args: Array[String]): Unit = {

    /*1.匹配数组*/
    for (ele <- List(
      Array(0),
      Array(0, 1),
      Array(0, 1, 4, 56),
    )) {
      var result = ele match {
        case Array(0) => "Array(0)"
        /*01.在去匹配数字的时候，1后面没有数字的话，但是在下面写上了_*这个传入进来的数据也会被匹配上（2个数据的）*/
        case Array(x, 1, _*) => "中间数字是1的，并且后面有多个数字"
        /*02.匹配两个数据*/
        case Array(x, y) => "Array()" + x + "," + y
      }
      println(result)
    }

    /*2.匹配列表*/
    var list1 = List(1, 2, 4, 7, 8, 9)
    var any = list1 match {
      /*1.解析：first是第一个数据1，second是第二个是数据2,rest是后面的其他数据
      *   rest是以列表的形式显示出来的*/
      case first :: second :: rest => println(s"第一个数据${first},第二个数据${second}，其他数据${rest}")
      case _ => println("SomeThing else")
    }
    /*3.匹配元组*/
    for (ele <- List(
      (0, 2),
      (0, 8),
      (0, 1, 4),
    )) {
      var result = ele match {
        /*01.匹配的是任何数*/
        case (a, b) => "" + a + "" + b
        /*02.匹配的是第一个是0,第二个是任何数*/
        case (0, _) => "(0,_)"
        /*03.第一个是0，第二，三个任何数，*/
        case (0, a, _) => "(0,_)" + a
      }
      println(result)
    }
    /*4.变量的方式匹配
    *   注意：剩下数据的显示的话，是按照列表的方式去显示的*/
    var first :: seconds :: rest = List(1,2,3,5,7,8)
    println(s"第一个数据${first},第二个数据${seconds},剩下的数据${rest}")
    /*5.元组数据方式对应
    *   同时遍历key和value*/
    val tuples: List[(String, Int)] = List(("a", 1), ("b", 2),("a",34))
    for ((word,count) <- tuples){
      println(word+" "+count)
    }
    /*01.只遍历key的方式去处理数据*/
    for ((word,_) <- tuples){
      println(word)
    }
    /*03.只筛选key a对应的value*/
    for (("a",acount) <- tuples){
      println(acount)
    }
  }
}
