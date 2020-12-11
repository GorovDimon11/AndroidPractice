fun main() {

    val mapPerson = mapOf(
        Person("Dima", 19) to "Java",
        Person("Anton", 21) to "C#",
        Person("Andrej", 18) to "JS")

    val sortedMap: Map<Person, String> = mapPerson.toSortedMap(compareBy { it.age })

    sortedMap.forEach { println(it) }
}

data class Person(val name: String, val age : Int)