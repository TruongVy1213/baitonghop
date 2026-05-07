package Prototype;

public class Rabbit implements Prototype {
    private String rabbitType;
    private String color;
    private int age;
    private Person owner;

    public Rabbit (String rabbitType, String color, int age, Person owner){
        this.rabbitType = rabbitType;
        this.color = color;
        this.age = age;
        this.owner = owner;
    }

    private Rabbit(Rabbit other){
        this.rabbitType = other.rabbitType;
        this.color = other.color;
        this.age = other.age;
        this.owner = other.owner.clone();
    }

    @Override
    public Rabbit clone() {
        return new Rabbit(this);
    }

    @Override
    public String toString() {
        return "Loai tho: " + rabbitType + " | " + "mau: " + color + " | "+ "tuoi(month): " + age + " | " + "chu nhan: " + owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
