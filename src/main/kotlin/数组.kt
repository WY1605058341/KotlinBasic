fun main() {
    //          kotlin         java
    //整形      IntArray        int[]
    //整形装箱   Array<Int>     Integer[]
    //字符      CharArray       char[]
    //字符装箱   Array<Char>    Character[]
    //字符串     Array<String>   String[]


    //数组的创建
    val c0 = intArrayOf(1, 2, 3, 4, 5)
    val c1 = IntArray(5) { it + 1 }   //it 表示数组的下标

    println(c1.contentToString()) //见数组转变成字符串打印

    //数组的长度
    val a = IntArray(5)
    val aSize = a.size  //数组的长度


    //数组的读写
    val d = arrayOf("Hello ", "World")
    d[1] = "kotlin"
    println("${d[0]},${d[1]}")


    //数组的遍历
    val e = floatArrayOf(1f, 2f, 3f)
    for (element in e) {
        println(element)
    }

    e.forEach {
        println(it)
    }

    if (1f in e) {
        println("存在数组中")
    }

    if (1.2f !in e) {
        println("如果存在数组中")
    }


}