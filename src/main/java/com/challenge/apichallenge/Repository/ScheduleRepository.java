package com.challenge.apichallenge.Repository;

import com.challenge.apichallenge.Entity.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ScheduleRepository extends JpaRepository<Schedules, Integer> {

}
