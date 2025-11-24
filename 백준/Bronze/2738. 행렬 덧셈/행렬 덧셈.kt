fun main() {
    val (n, m) = readLine()!!.split(" ").map{ it.toInt() }
    val arr1 = Array(n) {
        readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }
    
    val arr2 = Array(n) {
        readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }
    
    for(i in 0 until n) {
        for(j in 0 until m) {
            print("${arr1[i][j] + arr2[i][j]} ")
        }
        println()
    }
}