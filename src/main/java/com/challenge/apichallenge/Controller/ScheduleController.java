package com.challenge.apichallenge.Controller;

import com.challenge.apichallenge.DTO.ScheduleDto;
import com.challenge.apichallenge.Entity.Schedules;
import com.challenge.apichallenge.Services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @PostMapping("api/schedules")
    public Schedules postScheduleCtrl(@RequestBody ScheduleDto scheduleDto){
        return scheduleService.postSchedule(scheduleDto);
    }

    @GetMapping("api/schedules")
    public List<Schedules> getAllSchedulesCtrl(){
        return scheduleService.getAllSchedules();
    }
}
