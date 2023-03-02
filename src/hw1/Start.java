package hw1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

        ArrayList<String> bookAuthors = new <String>ArrayList();
        bookAuthors.add("John Grismham");
        bookAuthors.add("Peter Taylor");
        bookAuthors.add("Dan Brown");

        System.out.println(bookAuthors);

        Book bookInstance = new Book(
              "The little Prince",
              324,
              "Roman",
              bookAuthors
        );

        System.out.println(bookInstance);

        Car carInstance = new Car(
                "Hyundai i10",
                67,
                6.4,
                "2.2 CRDi 150 CV"

        );

        System.out.println(carInstance);

        Dog dogInstance = new Dog(
                "Tadashi",
                4,
                "Akita inu"
        );

        System.out.println(dogInstance);

    }
}
