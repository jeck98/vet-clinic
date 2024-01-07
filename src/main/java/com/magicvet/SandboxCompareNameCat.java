package main.java.com.magicvet;

import main.java.com.magicvet.comparator.CatNameComparator;
import main.java.com.magicvet.model.Cat;

import java.util.Arrays;

public class SandboxCompareNameCat {

    public static void main(String[] args) {

        Cat[] catName = {
                new Cat("Mix"),
                new Cat("Dina"),
                new Cat("Wax"),
                new Cat("Angel")
        };

        Arrays.sort(catName, new CatNameComparator());

        for (Cat cat : catName) {
            System.out.println(cat.getName());
        }


    }
}
