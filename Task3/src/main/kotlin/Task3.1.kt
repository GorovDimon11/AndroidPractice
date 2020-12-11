fun main() {

    val listOfNumbers: List<Int> = listOf(1, 2, 3, 3, 3, 3, 3, 3, 2, 5, 5, 5, 5, 5)

    val max = listOfNumbers.groupingBy { it }.eachCount().maxByOrNull { it.value }

    println("Max value from list is $max")
}