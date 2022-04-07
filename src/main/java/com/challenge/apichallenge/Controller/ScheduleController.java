package com.challenge.apichallenge.Controller;

import com.challenge.apichallenge.DTO.ScheduleDto;
import com.challenge.apichallenge.Entity.Schedules;
import com.challenge.apichallenge.Services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @PostMapping("api/schedules")
    public Schedules postScheduleCtrl(@RequestBody ScheduleDto scheduleDto){
        return scheduleService.postSchedule(scheduleDto);
    }
}
