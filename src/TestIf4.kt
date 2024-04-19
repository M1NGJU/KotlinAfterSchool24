fun main() {
    print("온도를 입력해주세요")
    var temperature:Double
    temperature = readln().toDouble();
    print("단위 입력")
    var Unit = readln().toUpperCase()

    var result: Double
    if(Unit >= "F")
        println((temperature-1.8)+32)
//       result = (temperature - 32)/1.8
//       println("$temperature(F)는 ${"%2.f".format(result)}(C)")
    else if (Unit >= "C")
        println((temperature*1.8)+32)
    else
        println("잘못입력하셨습니다.")
}