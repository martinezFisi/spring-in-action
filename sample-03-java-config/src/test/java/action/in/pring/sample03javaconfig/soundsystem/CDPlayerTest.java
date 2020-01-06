package action.in.pring.sample03javaconfig.soundsystem;

import action.in.pring.sample03javaconfig.configuration.CDPlayerConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
@SpringJUnitConfig(CDPlayerConfig.class)
class CDPlayerTest {

    @Autowired
    private MediaPlayer cdPlayer;

    @Test
    void play() {
        cdPlayer.play();
    }
}