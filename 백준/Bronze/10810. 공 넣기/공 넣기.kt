fun main() {
    val (n, m) = readLine()!!.split(" ").map{it.toInt()}
    val arr = IntArray(n)
    
    for(i in 0 until m) {
        val (a, b, c) = readLine()!!.split(" ").map {it.toInt()}
        
        for(j in a-1 until b) {
            arr[j] = c
        }
    }
    
    arr.forEach {
        print("${it} ")
    }
}