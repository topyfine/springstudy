package cinematest;

import cinema.server.config.RmiProviderConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RmiProviderConfig.class})
public class RmiProviderTest {

    @Autowired
    RmiServiceExporter serviceExporter;

    @Test
    public void testRmiProvider(){
        Assert.assertNotNull(serviceExporter);
        //阻止测试方法结束进程关闭，服务提供中断
        while (true) {}
    }
}
