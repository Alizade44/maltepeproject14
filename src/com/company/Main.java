package tr.edu.maltepe.oop;

import javax.xml.stream.util.StreamReaderDelegate;
import java.lang.annotation.Target;

public class Main2 {

    public static void main(String [] er)  {

//        // Create the library
//        Library lib = new Library();
//
//        Prof p1 = new Prof();
//        Student s1 = new Student();
//
//        //Creat Books
//        Book firstBook = new Book("First Book");
//        Book secondBook = new Book("Second Book");
//        Book thirdBook = new Book("Third Book");
//
//        // Add Books To Library
//        lib.addBook(firstBook);
//        lib.addBook(secondBook);
//        lib.addBook(thirdBook);
//
//        System.out.println("Books available in the library before lending:");
//        lib.printAvailableBooks();
//        System.out.println();
//
//        //Lending Books
//        lib.lendBookToProf(p1, firstBook);
//        lib.lendBookToStud(s1, secondBook);
//
//        System.out.println("Books available in the library after lending:");
//        lib.printAvailableBooks();
//        System.out.println();
//
//        System.out.println("Book borrowed to Prof:");
//        p1.printAvailableBooks();
//        System.out.println();
//
//        System.out.println("Book borrowed to Student:");
//        s1.printAvailableBooks();
//        System.out.println();
//
//        s1.returnBook(lib, secondBook);
//        p1.returnBook(lib, firstBook);
//
//        System.out.println("Print Books in the library after returning:");
//        lib.printAvailableBooks();

        Student s1 = new Student();
        Student s2 = new Student();
        Prof p1 = new Prof();
        p1.setName("Ahmed");

        SportCenter sc = new SportCenter();

        s1.playing();
        s1.setName("Ali");
        s2.setName("Hazem");
        s1.playingFootball(s1.getName(), sc);
        s1.swimming(s2.getName(),sc);
        sc.printMembers();

        System.out.println();


        p1.playingFootball(p1.getName(), sc);
        sc.printMembers();






    }
}


