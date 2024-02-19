package com.example.navigationcomponentkullanimi

import java.io.Serializable

//Serializable veri transferi için gerekli olan komutturü
//Fragments arguements kısmında urunler class ının görünmesini sağlar

data class Urunler(var id:Int, var ad:String): Serializable {
}