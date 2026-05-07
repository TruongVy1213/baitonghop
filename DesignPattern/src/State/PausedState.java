package State;

public class PausedState implements State{
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Đã dừng phát");
    }

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Đang phát");
        player.setState(new PlayingState());
        player.setIcon("Pause Icon");
    }
}
