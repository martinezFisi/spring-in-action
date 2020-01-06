package action.in.pring.sample03javaconfig.soundsystem;

public class CDPlayer implements MediaPlayer {

    CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }

}
