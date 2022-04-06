package com.challenge.apichallenge.Controller;

import com.challenge.apichallenge.DTO.ScheduleDto;
import com.challenge.apichallenge.Entity.Schedules;
import com.challenge.apichallenge.Services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    public Schedules postScheduleCtrl(ScheduleDto scheduleDto){
        return scheduleService.postSchedule(scheduleDto);
    }
}
