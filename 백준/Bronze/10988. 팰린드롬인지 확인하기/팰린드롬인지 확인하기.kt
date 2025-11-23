fun main() {
    val s = readLine()!!
    var halfS = ""
    var halfA = ""
    for(i in 0 until s.length/2) {
        halfS += s[i]
    }
    halfS = halfS.reversed()
    for(i in (s.length+1)/2 until s.length) {
       halfA += s[i]
    }
    
    if(halfS == halfA) print(1) else print(0)
}
/*
    val s = readLine()!!.toString()
    if(s == s.reversed()) print(1) else print(0)
    도 가능 반복문 써서 풀어봤음
*/
