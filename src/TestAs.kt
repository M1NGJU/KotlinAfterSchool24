fun main() {
    val a:Any = 10
    // print("${a+10]")  오류
    val b=a as Int
    print("${a+10}")

    val a2:Any = "10"       // val a:Any = 10 -> 출력 : 20
    val b2 = a2 as? Int     //int 형변환 실패 null 리턴
    if(b2 != null)
    print("${b2 + 10}")
    else
    print(b2)

}