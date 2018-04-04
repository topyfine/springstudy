import concert.Audience;
import concert.Encoreable;
import concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springconfig.AopConfig;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConfig.class})
public class AopTest {
    @Autowired
    Performance performance;

    @Autowired
    Audience audience;

    @Test
    public void testAop() {
        assertNotNull(performance);
//        performance.perform();
        performance.perform("arts");
        //方法增强
        ((Encoreable) performance).encore();
    }
}
