package com.example.rogovskih.kotlinplayground.spices

sealed class Spice(val name: String, color : SpiceColor, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry : Spice("curry", YellowSpiceColor ), Grinder{
    override fun prepareSpice() {
        println("chopping fetus...")
    }

    override fun grind() {
        prepareSpice()
    }
}

interface Grinder{
    fun grind()
}

interface SpiceColor{
    val color : Color
}

object YellowSpiceColor : SpiceColor{
    override val color: Color
        get() = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}