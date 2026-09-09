package org.eifr.dsm.ruta1._06

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int,
             val hobby: String?, val referrer: Person?) {

    fun showProfile() {
        val getNameStr = { "Name: $name" }
        val getAgeStr = { "Age: $age" }
        val getHobbyStr = {
            if (hobby != null) {
                "Likes to $hobby. "
            } else {
                "Doesn't have hobbies. "
            }
        }
        val getRefStr = {
            if (referrer != null) {
                "Has a referrer named ${referrer.name}" + if (referrer.hobby != null) ", who likes to ${referrer.hobby}." else "."
            } else {
                "Doesn't have a referrer."
            }
        }

        println(
            getNameStr() + "\n" +
            getAgeStr() + "\n" +
            getHobbyStr() +
            getRefStr() + "\n"
        )
    }
}
