package com.challenge.apichallenge.DTO;

import com.challenge.apichallenge.Entity.Films;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ScheduleDto {
    private int id_schedules;

    @JsonFormat(pattern = "dd-mm-yyyy hh:mm")
    private Date show_date;
    @JsonFormat(pattern = "dd-mm-yyyy hh:mm")
    private Date start;
    @JsonFormat(pattern = "dd-mm-yyyy hh:mm")
    private Date end;
    private int ticket_price;
    private Films films;




    public int getId_schedules() {
        return id_schedules;
    }

    public void setId_schedules(int id_schedules) {
        this.id_schedules = id_schedules;
    }

    public Date getShow_date() {
        return show_date;
    }

    public void setShow_date(Date show_date) {
        this.show_date = show_date;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public Films getFilms() {
        return films;
    }

    public void setFilms(Films films) {
        this.films = films;
    }
}
