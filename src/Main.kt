fun main() {
    toplama(null)
    toplama2(null)
}


//Aşağıdaki `toplama` fonksiyonunda `sayi2` nullable bir parametredir. Elvis operatörü (`?:`) ile `null` durumunda varsayılan bir değer (0) atanmıştır.
fun toplama(sayi2: Int?) {
    val sayi1 = 5
    val nullGelmisseDegeri = sayi2 ?: 0
    println("Sonuç:\t${sayi1 + nullGelmisseDegeri}")

}

//Aşağıdaki `toplama2` fonksiyonu, `sayi2` null olduğunda `IllegalArgumentException` fırlatır. Null olmayan bir değer gelirse toplama işlemi yapılır.

fun toplama2(sayi2: Int?) {
    val sayi1 = 5
    val nullGelmisseDegeri2 = sayi2 ?: throw IllegalArgumentException("sayi2 değeri null olkamaz!")
    println("Sonuç:\t${sayi1 + nullGelmisseDegeri2}")
}

