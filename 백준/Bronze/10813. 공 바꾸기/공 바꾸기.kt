fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(n + 1) { it }
    
    repeat(m) {
        val (i, j) = readLine()!!.split(" ").map { it.toInt() }
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
    
    for (index in 1..n) {
        print("${arr[index]} ")
    }
}