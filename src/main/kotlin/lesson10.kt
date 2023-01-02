fun main() {

      val itemCosts = mapOf("Хлеб" to 50.0,
          "Кефир" to 60.0, "Молоко" to 100)
      val shoppingList = listOf("Хлеб","Кефир", "Молоко" )


      for (key in itemCosts.keys ){
          println("стоимость покупки : $key: ${itemCosts.get(key)}")
      }

}


