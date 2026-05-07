package Builder;

public class Client {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom.BedroomBuilder("R1","double bed")
                .withColor("blue")
                .withSizeRoom(100)
                .withHasBalcony(true)
                .build();

        System.out.println(bedroom);
    }
}
