package com.michielswaanen.container;

import com.michielswaanen.iterators.IContactBookIterator;

public interface IContactBook {

    IContactBookIterator createAscendingNameIterator();
    IContactBookIterator createOldestContactIterator();
}
