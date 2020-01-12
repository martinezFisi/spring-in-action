package action.in.spring.sample05mixjavaconfigandxml.soundsystem.player;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CDPlayerTest {

    @Autowired
    @Qualifier("cdPlayerDookie")
    MediaPlayer mediaPlayer;

    @Test
    void playDookie() {
        mediaPlayer.play();
    }

}