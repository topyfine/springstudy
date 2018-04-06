package musictest;

import music.config.MusicConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MusicConfig.class})
@ActiveProfiles("test")
public class JdbcTemplateTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void testJdbcTemplate() {
        Assert.assertNotNull(jdbcTemplate);
        int result = jdbcTemplate.queryForObject("select 1+2", Integer.class);
        Assert.assertEquals(3, result);
    }

}
