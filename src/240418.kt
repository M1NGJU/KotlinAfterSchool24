fun opp(x:Int,y:Int,op:String):Int{
    var result = 0
    when(op) {
        "+" -> result = x+y
        "-" -> result = x-y
        "*" -> result = x*y
        "/" -> {
            if(y != 0)
                result = x/y
            else println("0으로 나눌수 없었습니다")
        }
        else -> println("+ - * / 연산자만 입력하세요")

    }
    return result
}

fun main() {
    print("숫자1>>")
    var n1 = readln().toInt()
    print("숫자2>>")
    var n2 = readln().toInt()
    print("연산자>>")
    var s = readln()
    println("${n1} ${s} ${n2} = ${opp(n1,n2,s)}")
}