package main.java.com.magicvet;

import main.java.com.magicvet.comparator.DogAgeComparator;
import main.java.com.magicvet.model.Dog;

import java.util.Arrays;

public class SandboxCompareDogAge {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Mixi", "2"),
                new Dog("Barry", "1"),
                new Dog("Dinky", "8"),
                new Dog("Ammy","6")
        };

        Arrays.sort(dogs, new DogAgeComparator());

        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " (" + dog.getAge() + ")");
        }
    }
}
