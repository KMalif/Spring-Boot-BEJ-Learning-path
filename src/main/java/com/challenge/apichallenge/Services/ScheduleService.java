package com.challenge.apichallenge.Services;

import com.challenge.apichallenge.DTO.ScheduleDto;
import com.challenge.apichallenge.Entity.Schedules;
import com.challenge.apichallenge.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    public Schedules postSchedule(ScheduleDto scheduleDto){
        Schedules schedules = new Schedules();
        schedules.setShow_date(scheduleDto.getShow_date());
        schedules.setStart(scheduleDto.getStart());
        schedules.setEnd(scheduleDto.getEnd());
        schedules.setTicket_price(scheduleDto.getTicket_price());
        schedules.setFilms(scheduleDto.getFilms());
        return scheduleRepository.save(schedules);
    }

    public List<Schedules> getAllSchedules(){
        return scheduleRepository.findAll();
    }
}
