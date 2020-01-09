package action.in.spring.sample04xml.systemsound;

public class AmericanIdiot implements CompactDisc {

    String title = "American Idiot";
    String artist = "Green Day";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
