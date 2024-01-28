package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Dog extends Pet {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private Size size;
    private HealthState healthState;
    private final LocalDateTime registrationDate = LocalDateTime.now();

    public Dog() {}



    public Dog(Size size) {
        this.size = size;
    }

    public Dog(String name, String age) {
        setName(name);
        setAge(age);
    }

    public Dog(HealthState healthState) {
        this.healthState = healthState;
    }

    @Override
    public String toString() {
        return "{type = " + getType()
                + ", name = " + getName()
                + ", age = " + getAge()
                + ", sex = " + getSex()
                + ", size = " + size
                + ", registrationDate = " + registrationDate.format(FORMATTER)
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public enum Size {
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0)
        ;

        private final int value;

        Size(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
