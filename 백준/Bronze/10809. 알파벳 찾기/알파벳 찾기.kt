fun main() {
    val s = readLine()!!
    val arr = IntArray(26) { -1 }
    
    for(i in 0 until s.length) {
        val index = s[i].toInt() - 97
        if(arr[index] == -1 ) {
            arr[index] = i
        }
    }
    
    arr.forEach {
        print("${it} ")
    }
}