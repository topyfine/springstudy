package musictest;

import music.config.MusicConfig;
import music.dao.MusicDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MusicConfig.class})
@ActiveProfiles("dev")
public class MusicTest {

    @Autowired
    MusicDAO musicDAO;

    @Test
    public void testAddMusic() {
        Assert.assertNotNull(musicDAO);
        musicDAO.addMusic();
    }
}
