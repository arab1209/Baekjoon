fun main() {
    val arr = Array(9) { IntArray(9) }
    
    for(i in 0 until arr.size) {
        arr[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }
    
    var max = arr[0][0]
    var row = 1
    var col = 1
    
    for(i in 0 until arr.size) {
        for(j in 0 until arr.size) {
            if(arr[i][j] > max) {
                max = arr[i][j] 
                row = i + 1
                col = j + 1
            }
        }
    }
    println(max)
    println("$row $col")
}