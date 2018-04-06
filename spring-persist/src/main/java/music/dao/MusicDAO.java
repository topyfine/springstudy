package music.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MusicDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addMusic() {
        jdbcTemplate.queryForObject("SELECT COUNT(1)", Integer.class);
        System.out.println(">>> add music.");
    }
}
