fun main() {
    //if...else
    val a: Int = 6
    val b: Int
    var c: Int

    if (a == 3) {
        c = 4
    } else {
        c = 5
    }

    c = if (a == 3) 4 else 5


    //when
    when (a) {
        0 -> c = 5
        1 -> c = 100
        else -> c = 20
    } //直接写成表达式

    c = when (a) {
        0 -> 5
        1 -> 100
        else -> 20
    }


    //条件转移到分支
    var x: Any = 0
    when {
        x is String -> c = x.length
        x == 1 -> c = 100
        else -> c = 20
    }

    c = when {
        x is String -> x.length
        x == 1 -> 100
        else -> 20
    }


    c = when (val input = readLine()) {
        null -> 0
        else -> input.length
    }




}