package spittr.service;

import org.springframework.stereotype.Service;

@Service
public class SpittrServiceImpl implements ISpittrService {
    @Override
    public void notice() {
        System.out.println(">>> spittr service.");
    }
}
