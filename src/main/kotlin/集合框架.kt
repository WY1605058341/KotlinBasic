fun main() {

    //不可变List     List<T>
    //可变List       MutableList<T>

    val intList: List<Int> = listOf(1, 2, 3) //不能添加和删除元素
    val intList2: MutableList<Int> = mutableListOf(1, 2, 3) //


    //不可变Map      Map<K,V>
    //可变Map        MutableMap<K,V>
    //Any 表示所有类型的父类，相当于java里面的Object
    val map: Map<String, Any> = mapOf("name" to "weiyu", "age" to 30)
    val map2: Map<String, Any> = mutableMapOf("name" to "weiyu", "age" to 30)

    //不可变Set      Set<T>
    //可变Set        MutableSet<T>


    //集合的创建
    val stringList = ArrayList<String>()
    for (i in 0..10) {
        stringList += "num:$i" //相当于：stringList.add("num:$i")
    }

    for (i in 0..10) {
        stringList -= "num:$i" //相当于：stringList.remove("num:$i")
    }


    val map3 = HashMap<String, Int>()
    map3["Hello"] = 10
    println(map3["Hello"])


    //Pair
    val pair = "Hello" to "Kotlin"
    val pair2 = Pair("Hello", "Kotlin")
    val first = pair.first
    val second = pair.second
    val (x, y) = pair
    println(x)


    //Triple
    val triple = Triple("x", 2, 3.0)
    val firstTriple = triple.first
    val secondTriple = triple.second
    val thirdTriple = triple.third
    val (m, n, k) = triple


}