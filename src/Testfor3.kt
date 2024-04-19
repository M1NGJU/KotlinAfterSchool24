fun main() {
    print("정수를 입력>>")
    var n = readln().toInt()

    for(i in n downTo 1)
        print("$i")
    println()
}