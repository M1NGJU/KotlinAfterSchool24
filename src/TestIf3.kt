fun main() {
    print("점수를 입력해 주세요")
    var score: Int
    score = readln().toInt()
    if(score >= 90)
        println("A")
    else if(score >= 80)
        println("B")
    else if(score >= 70)
        println("C")
    else if(score >=60)
        println("D")
    else
        println("f")

}