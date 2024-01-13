package main.java.com.magicvet;

import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;


import java.util.Arrays;
import java.util.Comparator;

public class SandboxHealthState {

    public static void main(String[] args) {
        Dog[] dog = {
                new Dog(Pet.HealthState.MEDIUM),
                new Dog(Pet.HealthState.BAD),
                new Dog(Pet.HealthState.NORMAL),
                new Dog(Pet.HealthState.BAD),
                new Dog(Pet.HealthState.NORMAL)
        };

        Arrays.sort(dog, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getHealthState().getValue() - o2.getHealthState().getValue();
            }
        });

        for (Dog dogs : dog) {
            System.out.println(dogs.getHealthState());
        }

    }
}
