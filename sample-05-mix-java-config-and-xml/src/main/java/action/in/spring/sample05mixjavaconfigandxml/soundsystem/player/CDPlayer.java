package action.in.spring.sample05mixjavaconfigandxml.soundsystem.player;

import action.in.spring.sample05mixjavaconfigandxml.soundsystem.cd.CompactDisc;

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
