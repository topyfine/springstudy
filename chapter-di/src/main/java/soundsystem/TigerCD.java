package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class TigerCD implements CompactDisc {

    @Override
    public void play() {
        System.out.println(">>> 播放CD...");
    }
}
