fun FunTest(a:Int,b:Int):Int{
    return a + b
}
fun max(a:Int,b:Int) = if(a>b) a else b
fun main(){
    print("정수1 입력>> ");
    var x = readln().toInt()
    print("정수2 입력>> ");
    var y = readln().toInt()
    println("$x 와 $y 중 더 큰 수 = ${max(x,y)}")

}