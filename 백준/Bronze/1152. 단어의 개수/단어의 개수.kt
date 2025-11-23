fun main() {
    val s = readLine()!!.trim()
    
    if(s.isEmpty()) {
        print(0)
    } else {
        print(s.split(" ").size)
    }
}