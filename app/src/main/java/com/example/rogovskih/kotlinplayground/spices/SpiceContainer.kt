package com.example.rogovskih.kotlinplayground.spices

data class SpiceContainer(val spice : Spice) {
    val label : String = spice.name
}