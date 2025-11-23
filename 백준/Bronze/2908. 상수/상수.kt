fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toString() }
    val first = a.reversed()
    val second = b.reversed()
    if(first < second) print(second) else print(first)
}