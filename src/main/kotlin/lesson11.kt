var myMap: HashMap<String, String>? = null

fun main() {

    val names: Array<String> = arrayOf("KG", "RU", "USA", "TR")

    val codes: Array<String> = arrayOf("+996", "+7", "+1", "+98")

    myMap = hashMapOf()

   for(i in 0..4){
       println(names[i])
       if (i in 0..4){
           println(codes[i])
       }
   }


}


