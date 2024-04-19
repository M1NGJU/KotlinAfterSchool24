fun main() {
    var x=0
    var sum1 = 0

    while (x<10){
        sum1 += ++x
    }
    println(sum1)

    var x2 = 0
    var sum2 = 0
    while (true){
        sum2 += ++x2
        if(x2 ==10)
            break
    }
    println(sum2)
}