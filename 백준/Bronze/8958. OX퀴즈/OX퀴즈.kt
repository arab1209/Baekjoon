fun main() {
    val count = readLine()!!.toInt()
    var total = 0
    
    for(i in 0 until count) {
        val text = readLine()!!.toString()
        var num = 0
        for(j in text) {
            if(j == 'O') {
                num++
                total += num
            } else {
                num = 0
            }
        }
        println(total)
        total = 0
    }
}