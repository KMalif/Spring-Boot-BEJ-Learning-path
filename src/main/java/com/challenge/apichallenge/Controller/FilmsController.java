package com.challenge.apichallenge.Controller;

import com.challenge.apichallenge.DTO.FilmsDto;
import com.challenge.apichallenge.Entity.Films;
import com.challenge.apichallenge.Services.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmsController {
    @Autowired
    FilmsService filmsService;

    @PostMapping("api/films")
    public Films postFilmsCtrl(@RequestBody FilmsDto filmsDto){
        return filmsService.post_films(filmsDto);
    }

    @GetMapping("api/films")
    public List<Films> getAllFilmsCtrl(){
        return filmsService.getAllFilms();
    }

    @GetMapping("api/films/{id}")
    public Films getFilmByIdCtrl(@PathVariable("id") int id){
        return filmsService.getFilmById(id);
    }

    @PutMapping("api/films/{id}")
    public Films updateFilmCtrl(@PathVariable("id") int id, FilmsDto filmsDto){
        return filmsService.updateFilm(id, filmsDto);
    }

    @DeleteMapping("api/films/{id}")
    public void deleteFilmCtrl(@PathVariable("id") int id){
        filmsService.deleteFilm(id);
    }

}
