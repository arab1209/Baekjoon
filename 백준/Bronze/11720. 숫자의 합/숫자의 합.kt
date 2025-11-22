fun main() {
    val size = readLine()!!.toInt()
    val value = readLine()!!
    var total = 0
    
    for(i in 0 until value.length) {
        total += value[i].toString().toInt()
    }
    
    print(total)
}