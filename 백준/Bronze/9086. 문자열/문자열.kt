fun main() {
    val size = readLine()!!.toInt()
    for(i in 0 until size) {
        val s = readLine()!!
        print("${s.first()}${s.last()}")
        println()
    }
}