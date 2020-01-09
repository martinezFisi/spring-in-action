package action.in.spring.sample04xml.systemsound;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
class CDPlayerTest {


    @Qualifier("cdPlayer")
    @Autowired
    private MediaPlayer mediaPlayer;

    @Resource(name = "cdPlayer2")
    private MediaPlayer mediaPlayer2;

    @Test
    void cdIsNotNull(){
        assertNotNull("cdPlayer cant null", mediaPlayer);
    }

    @Test
    void playDookie() {
        mediaPlayer.play();
    }

    @Test
    void playAmericanIdiot() {
        mediaPlayer2.play();
    }

}