fun main() {

    var nonNull: String = "";
//    nonNull = null //报错，不可复制为null
    val length = nonNull.length

    //定义类型的时候，定义可为空
    var nullable: String? = "hello"
    nullable = null
//    val length1 = nullable.length //报错，因为有可能发生空指针异常

//    val length2 = nullable!!.length //强转异常,不建议使用

    //安全访问,当nullable 为空的时候，length3也有可能为空，后面代码使用 到length3的时候，也有可能报错
//    val length3 = nullable?.length


    //?: 是elvis运算符  整个的逻辑是：如果 nullable?.length 的值为空，那么就将0赋值给length4
    val length4 = nullable?.length ?: 0


    //在空类型中，所有非空类型都是类型的子类
    var x: String = "Hello"
    var y: String? = "Kotlin"
//    x = y  //报错
    y = x //说明x是y的子类


}

