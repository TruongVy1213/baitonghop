package State;

public class Client {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.play();
        System.out.println(player.getIcon());

        player.pause();
        System.out.println(player.getIcon());
    }
}
