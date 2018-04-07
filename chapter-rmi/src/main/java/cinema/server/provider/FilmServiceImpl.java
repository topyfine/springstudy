package cinema.server.provider;

import cinema.FilmService;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {
    @Override
    public String buyTicket() {
        System.out.println(">>> buy ticket[king of monkey].");
        return "king of monkey";
    }
}
