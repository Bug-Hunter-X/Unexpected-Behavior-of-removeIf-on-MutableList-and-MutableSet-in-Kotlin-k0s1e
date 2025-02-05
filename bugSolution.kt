fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.toMutableList()
    newList.removeIf { it > 2 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.toMutableSet()
    newSet.removeIf { it > 2 }
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 2]
}
