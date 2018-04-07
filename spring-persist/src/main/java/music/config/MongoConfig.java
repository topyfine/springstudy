package music.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import java.util.Arrays;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "develop";
    }

    @Override
    public Mongo mongo() throws Exception {
        //无需认证
        return new MongoClient("localhost");
        // 需要认证
       /* MongoCredential credential = MongoCredential.createCredential("dev",
                "OrderDB", "123456".toCharArray());
        return new MongoClient(new ServerAddress("localhost"),
                Arrays.asList(credential));*/
    }
}
