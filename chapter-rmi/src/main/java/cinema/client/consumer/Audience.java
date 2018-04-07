package cinema.client.consumer;

import cinema.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Audience {

    @Autowired
    FilmService filmService;

    public String watchFilm() {
        String film = filmService.buyTicket();
        System.out.println(">>> watch film[" + film + "].");
        return film;
    }
}
