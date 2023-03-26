package com.example.odev2

class Odev2 {
    fun soru1(degree: Int): Double{
        return degree*1.8+32
    }

    fun soru2(kisakenar:Int, uzunkenar:Int):Int{
        return kisakenar*2 + uzunkenar*2
    }

    fun soru3(sayi:Int) :Int{
        if (sayi==1 || sayi==0){
            return 1
        }
        return sayi*soru3(sayi-1)
    }
    fun soru4(kelime: String):Int{
        var sayac =0
        for (harf in kelime){
            if(harf=='a'){
                sayac++
            }
        }
        return sayac
    }

    fun soru5(kenarSayisi:Int):Int{
        val toplamIcAci = (kenarSayisi-2)*180
        return toplamIcAci
    }

    fun soru6(gunSayisi:Int):Int{
        val calismaUcreti = 10
        val mesaiUcreti = 20
        val calismaSaati = 8
        val toplamCalısmaSaati = gunSayisi * calismaSaati
        val günlükCalismaSaati = if (toplamCalısmaSaati < 160) 160 else toplamCalısmaSaati
        val mesaiCalismaSaati =if (toplamCalısmaSaati >160 ) toplamCalısmaSaati-160 else 0

        val toplamMaas =(günlükCalismaSaati*calismaUcreti)+ (mesaiCalismaSaati*mesaiUcreti)
        return  toplamMaas
    }

    fun soru7(kullanilanInternet:Int):Int{
        val kotaSiniri = 50
        val asilanKota = kullanilanInternet- kotaSiniri
        var ucret =100
        if (asilanKota>0){
            ucret += asilanKota*4
        }
        return ucret
    }
}