package com.michielswaanen;

import com.michielswaanen.container.ContactBook;
import com.michielswaanen.iterators.IContactBookIterator;
import com.michielswaanen.objects.Contact;

public class Main {

    public static void main(String[] args) {

        // Initialisation
        Contact john = new Contact("John Doe", "0495812459", 2000);
        Contact jane = new Contact("Jane Doe", "0495812457", 2002);
        Contact bob = new Contact("Bob Bobbings", "0495812453", 1999);
        Contact tom = new Contact("Tom Tommings", "0495812451", 2001);

        ContactBook contactBook = new ContactBook(john, jane, bob, tom);

        // Iterator Pattern (just iterate over a data structure without knowing the internal implementation)

        // Iterate by ascending name
        IContactBookIterator nameIterator = contactBook.createAscendingNameIterator();

        while(nameIterator.hasNext()) {
            Contact contact = nameIterator.next();
            printUtil(contact);
        }

        // Iterate by oldest birth year
        IContactBookIterator ageIterator = contactBook.createOldestContactIterator();

        while(ageIterator.hasNext()) {
            Contact contact = ageIterator.next();
            printUtil(contact);
        }
    }

    private static void printUtil(Contact contact) {
        String name = contact.getName();
        String phoneNumber = contact.getPhoneNumber();
        int birthYear = contact.getBirthYear();
        System.out.println(name + ", birth year: "+ birthYear + ", phone: " + phoneNumber);
    }
}
