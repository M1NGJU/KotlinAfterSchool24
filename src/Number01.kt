fun main() {
    val num01 = 127
    val num02 = 32768
    val num03 = 922372012121212     //long으로 추론

    println("num01:$num01, num02:$num02, num03:$num03:$num03\n")

    val exp01 = 3.14    //기본적으로 Double형으로 추론
    val exp02 = 3.14F   // 형식문자 f에 의해 float형으로 추론
    val exp03 = 3.14E-2     //왼족으로 소수점 자리 이동, Double로 추론
    val exp04 = 3.14e2f     //오른쪽으로 소수점 자리 이동. Float로 추론

    println("exp01:$exp01, exp02:$exp02, exp03:$exp03:$exp03\n")
}