fun main() {
    var a = readln().split(" ").map{it.toInt()}
    a = a.toMutableList()
    for (i in 0..a.size-1-1){
        var k = true
        for (j in 0..a.size-1-1-i) {
            if (a[j] > a[j + 1]) {
                val tem = a[j]
                a[j] = a[j + 1]
                a[j + 1] = tem
                k = false
            }
        }
        if (k) {
            break
        }
    }
    println(a)
    var b = readln().split(" ").map{it.toInt()}
    b = b.toMutableList()
    for (i in 0 until b.size-1){
        var k = i
        for (j in i+1 until b.size) {
            if (b[i] > b[j]) {
                k = j
            }
        }
        val m = b[i]
        b[i] = b[k]
        b[k] = m

    }
    println(b)
}
