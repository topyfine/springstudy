import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import springconfig.BeanConfig;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void testCompentScan() {
        assertNotNull(compactDisc);
//        compactDisc.play();
    }

}
