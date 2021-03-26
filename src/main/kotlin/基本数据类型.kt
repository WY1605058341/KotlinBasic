fun main() {
    //数据类型
    //字节：Byte
    //整形：Int Long
    //浮点型：Float Double
    //字符：Char
    //字符串：String


    //声明变量
    val a: Int = 2   //只读变量 ，编译器可以进行类型推导，可以直接写成  val a = 2
    var b: String = "Hello Kotlin"   //可读写变量（可以重新赋值）,可以直接写成  var b = "Hello kotlin"


    //Long类型数据
    val c = 1234567L  //必须要大写的L表示Long类型


    //kotlin 中的数值类型转换
    val d: Int = 10
    val e: Long = d.toLong()

    val float1 = 1F
    val double1: Double = float1.toDouble()


    //无符号类型
    //        有符号类型     无符号类型
    //  字节     Byte         UByte
    // 短整型    Short        UShort
    //  整形      Int          UInt
    // 长整型     Long         ULong
    // 字符串    String        String

    //字符串的比较
    // a == b 比较内容，相当于java 里面的equals
    // a === b  比较的是对象


}