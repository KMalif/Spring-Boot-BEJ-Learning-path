package com.challenge.apichallenge.DTO;

public class FilmsDto {
    private int id_films;
    private String film_name;
    private boolean showed;

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
