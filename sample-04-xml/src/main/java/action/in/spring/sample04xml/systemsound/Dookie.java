package action.in.spring.sample04xml.systemsound;

public class Dookie implements CompactDisc {

    String title = "Dookie";
    String artist = "Green Day";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
