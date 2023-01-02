fun main() {
    print ("Введите первое число  ")
    val a = readLine()?.toInt()
    print ("Введите второе число  ")
    val b = readLine()?.toInt()

    if(a==b){
        println ("Оба числа равны")
    }
    else if (a != null) {
        if(a<= b!!){
            println ("Первое число меньше второго")
        }else if (a != null){
            if(a>= b!!)
                println("Первое число больше второго")
        }
    }

}