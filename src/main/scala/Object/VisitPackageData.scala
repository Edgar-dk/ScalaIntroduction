package Object

/**
 * @author Edgar
 * @create 2022-10-14 10:26
 * @faction:
 */
object VisitPackageData {
  def main(args: Array[String]): Unit = {
    var nameL:String="llllllll"
    var na:String="kkk"
    /*1.分析。
    *   在去执行这个common函数的时候，本来以为是common参数传递进去
    *   其实先执行Package中common参数name这个，然后在执行传递过去的参数*/
    common("")
    common(nameL)
    common(na)
    println("========================")
//    common(name)
  }

}
