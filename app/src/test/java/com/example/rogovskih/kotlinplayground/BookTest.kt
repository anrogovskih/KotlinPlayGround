package com.example.rogovskih.kotlinplayground

import com.example.rogovskih.kotlinplayground.books.Book
import org.junit.Test

class BookTest {
    fun test(){
        val book : Book = Book("The Lord of The Rings", "J.R.R. Tolkien", 1954)
        println("Here is your book ${book.getFullInfo().first} written by ${book.getFullInfo().second} in ${book.getFullInfo().third}.")
    }

    @Test fun test2(){
        val allBooks = setOf(
            "The Hobbit",
            "Leaf by Niggle",
            "The Lay of Aotrou and Itroun",
            "The Lord of the Rings",
            "The Silmarillion")
        val library = mapOf("J. R. R. Tolkien" to allBooks)
        val hasSilmarillion = library.any{entry -> entry.value.contains("The Silmarillion") }
        assert(hasSilmarillion)
        val moreBooks = mutableMapOf("George R.R. Martin" to setOf("The song of fire and ice"))
        println(moreBooks.getOrPut("Ken Kizi"){setOf("One flew over cockoo's nest")})

    }
}