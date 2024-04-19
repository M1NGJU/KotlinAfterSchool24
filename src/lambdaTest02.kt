fun main() {
    val greething1:( ) -> Unit = { println("Hello World") }
    val greething2 = { println("Hello World")}
    greething1()
    greething2()

    val some1 = {no:Int -> println(no)}
    val some2:(Int) -> Unit = { println(it)}
    some1(10)
    some2(10)

    val someFun1 = {no1:Int,no2:Int -> no1>no2}
    val someFun2 :(Int,Int) -> Boolean = {no1,no2 -> no1>no2}
    println(someFun1(10,20))
    println(someFun2(10,20))
}
