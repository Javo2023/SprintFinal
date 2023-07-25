package com.example.sprintfinal

class ShoesList {
    companion object{
        fun getShoesList(): List<Shoes> {
            val shoeList = mutableListOf<Shoes>()
            val shoeItem1 = Shoes("Zapatilla 1", "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa/global/377873/04/sv01/fnd/CHL/w/1000/h/1000/fmt/png", 99.99, "Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem1)
            val shoeItem2 = Shoes("Zapatilla 2", "https://nikeclprod.vteximg.com.br/arquivos/ids/637318-1000-1000/CU4123_002_A_PREM-hei-3144-wid-3144-fmt.jpg?v=638078761736270000", 79.99, "Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem2)
            val shoeItem3 = Shoes("Zapato 3", "https://nikeclprod.vteximg.com.br/arquivos/ids/656971-1000-1000/DR9963_001_A_PREM.jpg?v=638096513927670000", 149.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem3)
            val shoeItem4 = Shoes("Zapato 4", "https://asicscl.vteximg.com.br/arquivos/ids/244182-1000-1000/1201A555_020_SR_RT_GLB.jpg?v=637995292182530000", 129.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem4)
            val shoeItem5 = Shoes("Zapato 5", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/643a8844d26a446c86e5acb800b3dfe6_9366/Zapatillas_Duramo_SL_Blanco_GV7125_01_standard.jpg", 109.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem5)
            val shoeItem6 = Shoes("Zapato 6", "https://nikeclprod.vteximg.com.br/arquivos/ids/620588-1000-1000/DJ5423_100_A_PREM.jpg?v=638029254413900000", 89.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem6)
            val shoeItem7 = Shoes("Zapato 7", "https://nikeclprod.vteximg.com.br/arquivos/ids/707784-1000-1000/DA7245_401_A_PREM.jpg?v=638182169849570000", 199.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem7)
            val shoeItem8 = Shoes("Zapato 8", "https://nikeclprod.vteximg.com.br/arquivos/ids/556078-1000-1000/DM8974_800_A_PREM.jpg?v=638005975009500000", 169.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem8)
            val shoeItem9 = Shoes("Zapato 9", "https://nikeclprod.vteximg.com.br/arquivos/ids/557115-1000-1000/CZ1864_502_A_PREM.jpg?v=638005982335270000", 119.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem9)
            val shoeItem10 = Shoes("Zapato 10", "https://nikeclprod.vteximg.com.br/arquivos/ids/594095-1000-1000/DM1123_001_A_PREM.jpg?v=638016363730030000", 149.99,"Zapatilla dama para toda ocasion, colores variados, material cuero, tallas 36 a 39")
            shoeList.add(shoeItem10)
            return shoeList
        }

    }
}