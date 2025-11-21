fun main() {
    val (n, m) = readLine()!!.split(" ").map{ it.toInt() }
    val arr = IntArray(n) { it+1 }
    
    for(i in 0 until m) {
        var (a, b) = readLine()!!.split(" ").map{ it.toInt() }
        while(a < b) {
            val temp = arr[a-1]
            arr[a-1] = arr[b-1]
            arr[b-1] = temp
            a++
            b--
        }
    }
    arr.forEach {
        print("${it} ")
    }
}
