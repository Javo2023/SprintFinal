package com.example.sprintfinal

class ShoesList {
    companion object{
        fun getShoeList(): List<Shoes> {
            val shoeList = mutableListOf<Shoes>()
            val shoeItem1 = Shoes("Zapato 1", "https://example.com/zapato1.jpg", 99.99, "Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem1)
            val shoeItem2 = Shoes("Zapato 2", "https://example.com/zapato2.jpg", 79.99, "Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem2)
            val shoeItem3 = Shoes("Zapato 3", "https://example.com/zapato3.jpg", 149.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem3)
            val shoeItem4 = Shoes("Zapato 4", "https://example.com/zapato4.jpg", 129.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem4)
            val shoeItem5 = Shoes("Zapato 5", "https://example.com/zapato5.jpg", 109.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem5)
            val shoeItem6 = Shoes("Zapato 6", "https://example.com/zapato6.jpg", 89.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem6)
            val shoeItem7 = Shoes("Zapato 7", "https://example.com/zapato7.jpg", 199.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem7)
            val shoeItem8 = Shoes("Zapato 8", "https://example.com/zapato8.jpg", 169.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem8)
            val shoeItem9 = Shoes("Zapato 9", "https://example.com/zapato9.jpg", 119.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem9)
            val shoeItem10 = Shoes("Zapato 10", "https://example.com/zapato10.jpg", 149.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem10)
            return shoeList
        }

    }
}