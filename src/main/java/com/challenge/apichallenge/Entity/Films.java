package com.challenge.apichallenge.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "Films")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_films")
    private int id_films;

    @Column(name = "film_name")
    private String film_name;

    @Column(name = "showed")
    private boolean showed;

    //spring.jackson.serialization.fail-on-empty-beans=false
    public Films (){}

    public Films(int id_films, String film_name, boolean showed) {
        this.id_films = id_films;
        this.film_name = film_name;
        this.showed = showed;
    }

    public int getId_films() {
        return id_films;
    }

    public void setId_films(int id_films) {
        this.id_films = id_films;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public boolean isShowed() {
        return showed;
    }

    public void setShowed(boolean showed) {
        this.showed = showed;
    }
}
