fun main(){
    print("Введите 1е число")
    var a = readLine()?.toInt()

    print("Введите 2е число")
    var b = readLine()?.toInt()

    var c = a!! + b!!
    println(c)

    print("Введите 1е число")
    var d = readLine()?.toInt()

    print("Введите 2е число")
    var f = readLine()?.toInt()

    var e = d!! - f!!
    println(e)
}