package Prototype;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("Hao");
        Rabbit rabbit1 = new Rabbit("Holland Lop", "white", 4, person);

        //clone
        Rabbit rabbit2 = rabbit1.clone();
        rabbit2.getOwner().setName("Dang Phong Hao");
        rabbit2.setColor("Blue");

        System.out.println("Rabbit 1: "+ rabbit1);
        System.out.println("Rabbit 2: " + rabbit2);
    }
}
