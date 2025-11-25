fun main() {
    var total = readLine()!!.toInt()
    for(i in 0..1) {
        total *= readLine()!!.toInt()
    }
    
    val str = total.toString()
    
    for(i in 0..9) {
        var count = 0
        for(j in 0 until str.length) {
            if(i == str[j].toString().toInt()) count++
        }
        println(count)
    }
}
