package main.java.com.magicvet.comparator;

import main.java.com.magicvet.model.Cat;

import java.util.Comparator;

public class CatNameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.toString().compareTo(cat2.toString());
    }

}
