package main.java.com.magicvet.model;

public class Dog extends Pet {

    private String size;

    @Override
    public String toString() {
        return "type = " + getType()
                + ", name = " + getName()
                + ", age = " + getAge()
                + ", sex = " + getSex()
                + ", size = " + size
                + " }";
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }


}
