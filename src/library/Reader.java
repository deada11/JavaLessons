package library;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Arrays;

public class Reader {
    String FIO, faculty, phone;
    int libraryCardNumber;
    Date dateOfBirth;

    public Reader(String FIO, String faculty, String phone, int libraryCardNumber, Date dateOfBirth) {
        this.FIO = FIO;
        this.faculty = faculty;
        this.phone = phone;
        this.libraryCardNumber = libraryCardNumber;
        this.dateOfBirth = dateOfBirth;

    }

    void takeBook() {
        System.out.println("Blob");
    }

    void takeBook(int booksCount) {
        System.out.printf("%s from %s takes %d books, phone is %s and card number is %d%n",
                FIO, faculty, booksCount, phone, libraryCardNumber);
        System.out.println("Was born at " + dateOfBirth);
    }

    void takeBook(String ... booksTitles) {
        System.out.println(FIO + " from " + faculty + " takes the books: " +
                Arrays.toString(booksTitles));
    }

    void takeBook(Book @NotNull ... book) {
        System.out.printf("%s from %s takes %d books: %n", FIO, faculty, book.length);
        for (Book value : book) {
            System.out.printf("Title is: %s%n Author is %s%n", value.title, value.author);
        }
    }

    void returnBook() {
        System.out.println("Blob");
    }

    void returnBook(int booksCount) {
        System.out.printf("%s from %s returns %d books, phone is %s and card number is %d%n",
                FIO, faculty, booksCount, phone, libraryCardNumber);
        System.out.println("Was born at " + dateOfBirth);
    }

    void returnBook(String ... booksTitles) {
        System.out.println(FIO + " from " + faculty + " returns the books: " +
                Arrays.toString(booksTitles));
    }

    void returnBook(Book @NotNull ... book) {
        System.out.printf("%s from %s returns %d books: %n", FIO, faculty, book.length);
        for (Book value : book) {
            System.out.printf("Title is: %s%n Author is %s%n", value.title, value.author);
        }
    }

}
