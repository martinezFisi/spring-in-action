package action.in.spring.sample05mixjavaconfigandxml.config;

import action.in.spring.sample05mixjavaconfigandxml.soundsystem.cd.AmericanIdiot;
import action.in.spring.sample05mixjavaconfigandxml.soundsystem.cd.CompactDisc;
import action.in.spring.sample05mixjavaconfigandxml.soundsystem.cd.Dookie;
import action.in.spring.sample05mixjavaconfigandxml.soundsystem.track.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@Configuration
@ImportResource({"classpath*:soundsystem-beans.xml"})
public class SoundSystemConfig {

    @Bean
    @Qualifier("dookie")
    public CompactDisc dookie(@Qualifier("dookieTrackList") List<Track> tracks){
        return new Dookie("Green Day", "Dookie", tracks);
    }

    @Bean
    @Qualifier("americanIdiot")
    public CompactDisc americanIdiot(@Qualifier("americanIdiotTrackList") List<Track> tracks){
        return new AmericanIdiot("Green Day", "American Idiot", tracks);
    }

}
