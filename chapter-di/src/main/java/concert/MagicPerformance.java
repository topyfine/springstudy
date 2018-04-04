package concert;

import org.springframework.stereotype.Component;

@Component
public class MagicPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println(">>> magic performance start.");
        /*Exception exception = null;
        exception.getLocalizedMessage();*/
    }

    @Override
    public void perform(String title) {
        System.out.println(">>> perform " + title + ".");
    }
}
