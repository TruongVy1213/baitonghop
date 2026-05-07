package Prototype;

public class Person implements Prototype {
    private String name;

    Person(String name){
        this.name = name;
    }

    //copy constructor
    private Person(Person other){
        this.name = other.name;
    }

    @Override
    public Person clone() {
        return new Person(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
