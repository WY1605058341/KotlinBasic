fun main() {

    //创建闭区间，包含起始值
    val intRange = 1..10  //[1,10]
    println(intRange.joinToString())
    val charRange = 'a'..'z'
    val longRange = 1L..100L

    //创建开区间,不包含结束值
    val intRangeExclusive = 1 until 10  //[1,10)
    val charRangeExclusive = 'a' until 'z'
    val longRangeExclusive = 1L until 100L


    //倒序区间,闭区间
    val intRangeReverse = 10 downTo 1  //[10,9,....,1]
    val charRangeReverse = 'z' downTo 'a'
    val longRangeReverse = 100L downTo 1L

    //区间的步长
    val intRangeWithStep = 1..10 step 2  //[1,3,5,7,9]
    val charRangeWithStep = 'a'..'z' step 2
    val longRangeWithStep = 1L..100L step 5  //1，6，11 .......

    //无符号
    val unitRange = 1U..10U
    val uLongRange = 1UL..10UL


    //区间的迭代
    for (element in intRange) {
        println(element)
    }

    intRange.forEach {
        println(it)
    }


    //区间的包含关系
    if (3 in intRange) {
        println("包含3")
    }

    if (12 !in intRange) {
        println("不包含12")
    }


    //遍历
    val array = intArrayOf(1, 3, 5, 7)
    for (i in array.indices) {
        println("$i   ${array[i]}")
    }


}