fun main(args: Array<String>) {
    var amount : Int  = 100000043 // сумма покупки
    var discount : Double // скидка
    var discountInt : Int
    var discountDouble : Double
    var oldbuyer = true // флаг постоянного покупателя
    var  discountDoubleRounded : Int


    if (amount <=10000 && amount >1000 ) {
        discount = 100.0
    } else if (amount >10000 ){
        discount = (amount * 0.05)
    }
    else {
        discount = 0.0}

    if (oldbuyer.equals(true) ){
        discount = (discount * 1.01)

    }

    discountInt = discount.toInt()
    discountDouble = discount - discountInt
    discountDouble = (discountDouble * 100)
    discountDoubleRounded = discountDouble.toInt()


    println("Ваша скидка составила " + discountInt + " руб. " + discountDoubleRounded + " коп.")
}