public class jv41_aggregation {

//    Aggregation = Represents a "has-a" relationship between objects.
//    One object contains another object as part of its structure,
//    but the contained object/s can exist independently.
        static void main() {

            Book book1 = new Book("the fellowship of the ring ",425);
            Book book2 = new Book ("the two towers",352);
            Book book3 = new Book("the return of the king ",416);

            Book[] books = {book1, book2,book3};

//            for(Book book :books){
//                System.out.println(book.displayInfo());
//            }

            Library library = new Library("NYC Public Library",1897, books);

            library.displayInfo();


        }
}
