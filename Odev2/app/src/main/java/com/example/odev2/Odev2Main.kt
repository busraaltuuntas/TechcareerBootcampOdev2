package com.example.odev2

fun main() {
    val odev = Odev2()

    val fahrenheit = odev.soru1(60)
    println("Fahrenheit : $fahrenheit")

    val kenarHesaplama = odev.soru2(10,30)
    println("Çevre : $kenarHesaplama")

    val faktoriyelSonuc = odev.soru3(6)
    println("Faktöriyer: $faktoriyelSonuc")

    val harfSayisi = odev.soru4("Alkışlamak")
    println("a harfi sayısı: $harfSayisi")

    val IcAciToplamı =odev.soru5(8)
    println("iç açıları toplamı: $IcAciToplamı")

    val maas = odev.soru6(27)
    println("Toplam maaş: $maas")

    val kotaUcreti= odev.soru7(72)
    println("Kullanım ücreti: $kotaUcreti")




}
