fun main() {
    for(i in 0 until readLine()!!.toInt()) {
        val (c, s) = readLine()!!.split(" ")
        for(j in 0 until s.length) {
            for(k in 0 until c.toInt()) {
                print(s[j])
            }
        }
        println()
    }  
}