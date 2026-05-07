package Factory;

public class Client {
    public static void main(String[] args) {
        Candy candy = CandyFactory.getCandy(CandyType.Alpenliebe);
        System.out.println(candy.getName());
    }
}
