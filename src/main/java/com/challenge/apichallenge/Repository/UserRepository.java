package com.challenge.apichallenge.Repository;

import com.challenge.apichallenge.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
     List<User> findAll();

     User findById(int id);
}
