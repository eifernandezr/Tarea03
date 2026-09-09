package org.eifr.dsm.ruta1._06

fun main() {
    val cancion = Song(
        "Song 2", "Blur",
        1997, 420)
    cancion.printDescription()
    println("Is this song popular? ${cancion.isPopular()}")
    cancion.plays = 1001
    println("Is this song popular? ${cancion.isPopular()}")

}

class Song(
    var title: String,
    var artist: String,
    var year: Int,
    var plays: Int = 0
) {

    fun printDescription() {
        println("$title, performed by $artist, was released in $year")
    }
    fun isPopular(): Boolean {
        return plays >= 1000
    }
}