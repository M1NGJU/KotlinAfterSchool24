fun main() {
//    val data1: Int=10 //컴파일시 기본형으로 변환됨
//    val data2: Int=10
//    println ("data1==data2 is ${data1==data2}") //true
//    println ("data1===data2 is ${data1===data2}") //true
//
//    println()
//    val int1=Integer(10)
//    val int2=Integer(10)
//    val int3=int1
//    println ("int1==int2 is ${int1==int2}")
//    println ("int1===int2 is ${int1===int2}")
//    println ("int1==int3 is ${int1==int3}")
//    println ("int1===int3 is ${int1===int3}")


    var str1:String = "hello"
    var str2 = "world"
    var str3 = "Hello"

    print("str1 === str2: ${str1 === str2}")
    print("str1 === str3: ${str1 === str3}")

    var str4 = String(charArrayOf('h','e','l','l','o'))
    print("str1 === str4: ${str1 === str4}")
    print("str1 == str4: ${str1 == str4}")

}