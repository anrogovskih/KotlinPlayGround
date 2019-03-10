package com.example.rogovskih.kotlinplayground.books

open class Book(val title : String, val author : String, val year : Int) {
    var currentPage : Int = 0

    open fun readPage() {
        currentPage++
    }

    fun getBasicInfo() : Pair<String, String>{
        return title to author
    }

    fun getFullInfo() : Triple<String, String, Int>{
        return Triple(title, author, year)
    }
}

class eBook(title : String, author : String, year : Int, val format : String = "text")
    : Book(title, author, year){

    var wordsCount : Int = 0
    override fun readPage(){
        wordsCount += 250
    }
}