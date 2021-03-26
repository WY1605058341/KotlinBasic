//类的定义 //默认是public
class SimpleClass {
    var x: Int = 0 //必须要初始化

    //定义一个方法
    fun y() {

    }
}


//定义构造方法
class SimpleClass1 {
    var x: Int = 0

    constructor(x: Int) {
        this.x = x
    }
}


//主构造器
class SimpleClass2 constructor(x: Int) {
    var x: Int = x
}

//主构造器可以进行省略
class SimpleClass3(x: Int) {
    var x: Int = x
}   //可以简写成

class SimpleClass4(var x: Int) {

}


fun main() {
    //类的实例化
    val simpleClass3 = SimpleClass3(3)
    println(simpleClass3.x)
}


//接口的定义
interface SimpleInf {
    fun simpleMethod()
}

//接口的实现
class SimpleClass5(var x: Int) : SimpleInf {
    override fun simpleMethod() {
        TODO("Not yet implemented")
    }
}

//抽象类的定义
abstract class AbsClass {
    //抽象方法一定要被复写
    abstract fun absMethod()

    //加上关键字open 才能被复写，否则将不能被复写
    open fun overridable() {}

    fun nonOverridable() {}

}

//对于类来说，只有加上  open class ....才能被继承
class SimpleClass6(var x: Int) : AbsClass(), SimpleInf {
    override fun absMethod() {
        TODO("Not yet implemented")
    }

    override fun simpleMethod() {
        TODO("Not yet implemented")
    }
}


class Person(age: Int, name: String) {
    var age: Int = age //property
        get() {
            return field
        }
        set(value) {
            field = value
        }
}