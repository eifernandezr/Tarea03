package org.eifr.dsm.ruta1._05

fun main() {
//    val coins: (Int) -> String = { "$it quarters" }
    val treatFunction = trickOrTreat(false, /*coins*/) {
        "$it quarters"
    }
    val trickFunction = trickOrTreat(true, null)

    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

fun trickFunction() {
    println("No treats!")
}

val trick = { println("No treats!") }

val treat: () -> Unit = { println("Have a treat!") }

fun trickOrTreat(isTrick: Boolean,
                 extraTreat: ((Int) -> String)?): () -> Unit {

    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}