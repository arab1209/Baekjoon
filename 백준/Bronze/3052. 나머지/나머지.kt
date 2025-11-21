fun main() {
    val arr = ArrayList<Int>()
    
    for(i in 0 until 10) {
        arr.add(readLine()!!.toInt() % 42)
    }
    
    println(arr.distinct().size)
}