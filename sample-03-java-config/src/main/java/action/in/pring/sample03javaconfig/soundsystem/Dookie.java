package action.in.pring.sample03javaconfig.soundsystem;

public class Dookie implements CompactDisc {

    private String title = "Dookie";
    private String artist = "Green Day";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
