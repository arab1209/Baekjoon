fun main() {
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var ascCount = 0
    var desCount = 0
 
    for(i in 0 until arr.size) {
        if(arr[i] == i+1) ascCount++
    }
    
    for(i in arr.size downTo 1) {
        if(arr[arr.size-i] == i) desCount++
    }
    
    if(ascCount == 8) print("ascending") 
    else if(desCount == 8) print("descending")
    else print("mixed")
}
