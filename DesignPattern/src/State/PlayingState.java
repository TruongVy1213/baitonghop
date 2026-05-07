package State;

public class PlayingState implements State{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Đã phát");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Tạm dừng phát");
        player.setState(new PausedState());
        player.setIcon("Play Icon");
    }
}
