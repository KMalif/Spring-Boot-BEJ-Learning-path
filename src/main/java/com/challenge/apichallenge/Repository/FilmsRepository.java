package com.challenge.apichallenge.Repository;

import com.challenge.apichallenge.Entity.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface FilmsRepository extends JpaRepository<Films, Integer> {
    Films findById(int id);

    List<Films> findByShowed(boolean showed);

    List<Films> findByFilmName(String filmName);
}
