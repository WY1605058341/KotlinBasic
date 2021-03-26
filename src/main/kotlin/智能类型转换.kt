interface Kotliner {

}

class Persons(var name: String, var age: Int) : Kotliner {

}

fun main() {
    val kotliner: Kotliner = Persons("weiyu", 20)
    if (kotliner is Persons) {
        println((kotliner as Persons).name)//自动
        println(kotliner.name)
    }


}