fun main() {
    print("==== 커피를 주문하세욤 ===")
    print("커피 종류")
    var menu:String
    menu = readln().toString()

    print("잔 수")
    var cup:Int
    cup = readln().toInt()

    if (menu == "에프")
        println("$menu $cup 잔은 ${cup * 2000} 원 입니다.")

    else if(menu == "아메")
        println("$menu $cup 잔은 ${cup * 2500} 원 입니다.")

    else if(menu == "카푸")
        println("$menu $cup 잔은 ${cup * 3000} 원 입니다.")

    else
        println("없는메뉴입니다.")
}