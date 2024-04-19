fun main() {
    println("숫자를 입력해주세요")
    var number =  readLine()!!.toInt()
    var result = 0
    for(i in 0..number step 1) {
        result += i
    }
    println("짝수의 합=$result")
}