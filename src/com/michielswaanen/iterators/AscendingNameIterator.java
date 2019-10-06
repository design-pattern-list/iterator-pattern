package com.michielswaanen.iterators;

import com.michielswaanen.objects.Contact;

import java.util.LinkedList;
import java.util.List;

public class AscendingNameIterator implements IContactBookIterator {

    private List<Contact> sortedContactBook;
    private int currentPosition;

    public AscendingNameIterator(List<Contact> contactList) {
        this.sortedContactBook = this.sortAscendingByName(contactList);
        this.currentPosition = 0;
    }

    private List<Contact> sortAscendingByName(List<Contact> contactList) {
        List<Contact> sortedContactBook = new LinkedList<>(contactList);

        for(int i = 0; i < sortedContactBook.size(); ++i) {
            for(int j = i + 1; j < sortedContactBook.size(); j++) {
                if(sortedContactBook.get(i).getName().compareTo(sortedContactBook.get(j).getName()) > 0) {
                    Contact tempContact = sortedContactBook.get(i);
                    sortedContactBook.set(i, sortedContactBook.get(j));
                    sortedContactBook.set(j, tempContact);
                }
            }
        }

        return sortedContactBook;
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < this.sortedContactBook.size();
    }

    @Override
    public Contact next() {
        if(this.hasNext())
            return this.sortedContactBook.get(this.currentPosition++);
        return null;
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
