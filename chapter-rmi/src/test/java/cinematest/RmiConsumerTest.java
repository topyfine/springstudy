package cinematest;

import cinema.client.config.RmiConsumerConfig;
import cinema.client.consumer.Audience;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RmiConsumerConfig.class)
public class RmiConsumerTest {

    @Autowired
    Audience audience;

    @Test
    public void testRmiConsumer() {
        Assert.assertNotNull(audience);
        Assert.assertEquals("king of monkey", audience.watchFilm());
    }
}
