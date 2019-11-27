package io.turntabl.functionalscala

object MyApp extends App {
    val books = List(
        Book("Macauley","The Green Horn", 2018, "Fiction") ,
        Book("Rowling","Harry Potter", 2006, "ScienceFiction"),
        Book("MacCarthy","The Red Riding Hood", 2012, "Drama"),
        Book("Goodman","The Good Wife", 1997, "Comedy"),
        Book("Bruceman","The New Dawn", 2000, "Comic")
    )

    def publishedIn(year: Int, books: List[Book]) = books

//    def booksByTitle(b: List[Book]) = books.map(book => book.title->book).toMap

    val booksByTitle = books.map(book => book.title -> book).toMap
    println (booksByTitle)

    val titles = List("The Green Horn", "Harry Potter", "The Consumer", "An Alien")

    val getBookstitles = titles flatMap booksByTitle.get
    println(getBookstitles)


}

