package com.michielswaanen.container;

import com.michielswaanen.iterators.AscendingNameIterator;
import com.michielswaanen.iterators.IContactBookIterator;
import com.michielswaanen.iterators.OldestContactIterator;
import com.michielswaanen.objects.Contact;

import java.util.List;

public class ContactBook implements IContactBook {

    private List<Contact> contacts;

    public ContactBook(Contact... contacts) {
        this.contacts = List.of(contacts);
    }

    @Override
    public IContactBookIterator createAscendingNameIterator() {
        return new AscendingNameIterator(this.contacts);
    }

    @Override
    public IContactBookIterator createOldestContactIterator() {
        return new OldestContactIterator(this.contacts);
    }
}
