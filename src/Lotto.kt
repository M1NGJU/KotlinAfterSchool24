fun main() {
    val lotto_range:IntRange = 1..45
    print("**로또 번호 생성을 시작합니다.**")
    print("몇 번을 뽑을까요?")
    var n = readln().toInt()
    for(i in 1..n) {
        print("자동번호 ->")
        for(j in 1..6){
            var out="%3d ".format(lotto_range.random())
            print(out)
        }
        println()
    }

}