package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * @author Edgar
 * @create 2022-08-12 20:03
 * @faction:
 */
object Test01 {
  def main(args: Array[String]): Unit = {
    /*1.从文件中读取数据
        Source是读取资源，读取那个地方的资源
    *   就需要fromFile参数中带上指定的路径，读取
    *   了之后，要干什么，那就是去foreach遍历里面的数据
    *   从而把数据打印出来*/
    Source.fromFile("src/main/resources/Hello.txt").foreach(print)


    /*2.将数据写入到文件中*/
    val printWriter = new PrintWriter(new File("src/main/resources/input.txt"))
    printWriter.write("dsd,ftgeg,hrehte,grehtr")
    printWriter.close()
  }

}
