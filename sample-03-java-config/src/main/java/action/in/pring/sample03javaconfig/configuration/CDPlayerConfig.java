package action.in.pring.sample03javaconfig.configuration;

import action.in.pring.sample03javaconfig.soundsystem.CDPlayer;
import action.in.pring.sample03javaconfig.soundsystem.CompactDisc;
import action.in.pring.sample03javaconfig.soundsystem.Dookie;
import action.in.pring.sample03javaconfig.soundsystem.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc dookie(){
        return new Dookie();
    }

    @Bean
    public MediaPlayer cdPlayer(){
        return new CDPlayer(dookie());
    }

}
