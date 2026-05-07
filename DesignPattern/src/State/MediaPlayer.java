package State;

public class MediaPlayer {
    private State state;
    private String icon;

    MediaPlayer(){
        this.state = new PausedState();
        this.icon = "Play Icon";
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void pause(){
        state.pause(this);
    }

    public void play(){
        state.play(this);
    }
}
