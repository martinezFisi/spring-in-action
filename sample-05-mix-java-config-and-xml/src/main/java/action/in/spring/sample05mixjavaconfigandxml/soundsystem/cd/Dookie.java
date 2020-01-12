package action.in.spring.sample05mixjavaconfigandxml.soundsystem.cd;

import action.in.spring.sample05mixjavaconfigandxml.soundsystem.track.Track;

import java.util.List;

public class Dookie implements CompactDisc {

    String artist;
    String title;
    List<Track> tracks;

    public Dookie(String artist, String title, List<Track> tracks) {
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        tracks.forEach(Track::play);
    }
}
