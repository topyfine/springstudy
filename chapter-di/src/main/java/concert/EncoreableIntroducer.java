package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EncoreableIntroducer {
    /**
     * 被通知类引入新方法,
     * 非必须是static
     */
    @DeclareParents(value = "concert.Performance+", defaultImpl = DefaultEncoreableImpl.class)
    public static Encoreable encoreable;
}
