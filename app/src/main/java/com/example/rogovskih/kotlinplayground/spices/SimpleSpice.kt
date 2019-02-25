package com.example.rogovskih.kotlinplayground.spices

class SimpleSpice {
    var name: String = "curry"
    var spiciness : String = "mild"
    val heat
    get() = when (spiciness){
        "mild" -> 5
        else-> 0
    }
}