package library;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        Date dayOfBirth = new Date();

        Book[] bookList = new Book[3];
        bookList[0] = new Book("Conan Doyle", "Sherlok Holmes");
        bookList[1] = new Book("Shaekspire", "Romeo and Juliette");
        bookList[2] = new Book("Glenford Mayers", "The art of software testing");

        readers[0] = new Reader("tester", "ittf", "123456789", 4441313, dayOfBirth);

        readers[0].takeBook();

        readers[0].takeBook(4);

        readers[0].takeBook("wrath", "of", "the", "lich", "king");

        readers[0].takeBook(bookList);

        readers[0].returnBook();

        readers[0].returnBook(5);

        readers[0].returnBook("breath", "of", "the", "wind");

        readers[0].returnBook(bookList);
    }
}
