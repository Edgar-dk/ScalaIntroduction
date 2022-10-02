package chapter03

/**
 * @author Edgar
 * @create 2022-08-15 20:27
 * @faction:
 */


/*1.乘法表和金字塔
*   二者之间最重要的就是
*   数据和数据之间的间距问题
*   */


object Test {
  def main(args: Array[String]): Unit = {
    /*01.注意：在一行里面的具体数据的时候，就是具体的列是
    *    按照行的数来规定的，*/
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }
    /*02.打印金字塔*/

    for (i <- 1 to 9) {
      val number=2*i-1
      val startLocation=9-i
      println(" " * startLocation+"*"*number)
    }

  }

}
