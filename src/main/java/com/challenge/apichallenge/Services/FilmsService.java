package com.challenge.apichallenge.Services;

import com.challenge.apichallenge.DTO.FilmsDto;
import com.challenge.apichallenge.Entity.Films;
import com.challenge.apichallenge.Repository.FilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsService {
    @Autowired
    FilmsRepository filmsRepository;

    public Films post_films(FilmsDto filmsDto){
        Films films = new Films();
        films.setFilm_name(filmsDto.getFilm_name());
        films.setShowed(filmsDto.isShowed());
        return filmsRepository.save(films);
    }

    public List<Films> getAllFilms(){
        return filmsRepository.findAll();
    }

    public Films getFilmById(int id){
        try{
            Films films = filmsRepository.getById(id);
            if (films != null){
                filmsRepository.findById(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Film not found");
        }
        return filmsRepository.findById(id);
    }

    public Films updateFilm(int id, FilmsDto filmsDto){
        Films updateFilm = new Films();
        try {
            Films films = filmsRepository.findById(id);
            films.setFilm_name(filmsDto.getFilm_name());
            films.setShowed(filmsDto.isShowed());
            updateFilm = filmsRepository.save(films);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Film not found");
        }
        return updateFilm;
    }

    public void deleteFilm(int id){
        try{
            Films films = filmsRepository.findById(id);
            if (films != null){
                filmsRepository.deleteById(id);
                System.out.println("Delete Success");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Film not found");
        }
    }


}
