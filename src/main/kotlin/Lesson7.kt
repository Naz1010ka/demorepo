fun main(){
    val a = 33

    val message =
        if (a % 2 == 0){
            "a is even 2"
        }
    else if (a % 5 == 0){
        "a is divisible by 5"
    }
    else{
        "a is not even and divisible by 5"
    }


    println(message)
}
