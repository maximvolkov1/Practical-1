fun main(args: Array<String>) {
    //первая задача
    val amount = 900
    val commission = 0.0075
    val cost = 35
    val res = if (amount * commission < cost) cost else amount * commission
    println("Результат: $res рублей")
    val remittance = amount - res.toInt()
    println("Перевод с комиссией составит: $remittance рублей")
    //вторая задача
    val likes = 11
    val result = if (likes.equals(1)) {
        "Понравилось $likes человеку"
    }
    else  {
        "Понравилось $likes людям"
    }
    println(result)
    //Третья задача
    val purchase = 15000
    val permanentBuyer = false
    var discount = 0
    if (purchase >= 1001 && purchase <= 10000) {
        discount = 100
    } else if (purchase >= 10001) {
        discount = (purchase * 0.05).toInt()
    }
    if (permanentBuyer) {
        discount += (purchase * 0.01).toInt()
    }
    val finalPurchase = purchase - discount
    println("Сумма покупки = $purchase руб")
    println("Скидка = $discount руб")
    println("Итоговая сумма = $finalPurchase руб")
}