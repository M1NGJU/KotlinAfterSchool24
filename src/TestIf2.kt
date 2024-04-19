fun main(){
    print("나이를 입력하세요>>")
    var aqe: Int
    var aqeRange: String
    try {
        aqe = readln().toInt()
        aqeRange = if (aqe in 10.. 18)
            "청소년"
        else if(aqe in 19 .. 29)
            "청년"
        else if(aqe in 30 .. 49)
            "중년"
        else if(aqe in 50 .. 64)
            "장년"
        else if (aqe >= 65)
            "노년"
        else
            "잘못입력"

        println("$aqe 세는 $aqeRange 입니다")
    } catch (e: Exception){
        println("null")
    }

}