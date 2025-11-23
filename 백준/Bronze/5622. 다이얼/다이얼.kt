fun main() {
    val arr = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    var total = 0
    
    val s = readLine()!!
    for(i in 0 until s.length) {
        total += arr.indexOfFirst { s[i] in it } + 3
    }
    
    print(total)
}