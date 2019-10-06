package com.michielswaanen.iterators;

import com.michielswaanen.objects.Contact;

public interface IContactBookIterator {

    boolean hasNext();
    Contact next();
    void reset();
}
