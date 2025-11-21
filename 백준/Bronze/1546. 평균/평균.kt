fun main() {
    val count = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map {it.toInt()}
    val max = arr.maxOrNull()
    var total = 0.0
    
    for(i in 0 until arr.size) {
        total += (arr[i].toDouble() /max!!)*100
    }
    
    print(total/count)
}