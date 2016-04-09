package com.mowen.designpattern.iterator;

import java.util.ArrayList;

/**
 * Created by mowen on 4/9/16.
 */
public class DinerMenuIterator implements Iterator {
    ArrayList items;

    public DinerMenuIterator(ArrayList items) {
        this.items = items;
    }
    public boolean hasNext() {
        return items.size() > 0;
    }

    public Object next() {
        return items.remove(0);
    }
}
