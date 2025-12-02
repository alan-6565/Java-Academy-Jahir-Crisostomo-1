package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T> {
    private List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public void showAll() { System.out.println(items); }
}
