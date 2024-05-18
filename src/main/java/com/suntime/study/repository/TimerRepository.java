<<<<<<< HEAD
package com.suntime.study.repository;

import com.suntime.study.entity.TimerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimerRepository extends JpaRepository<TimerEntity, Long> {
    List<TimerEntity> findAllByEmail(String userEmail);
}
=======
package com.suntime.study.repository;

import com.suntime.study.entity.TimerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimerRepository extends JpaRepository<TimerEntity, Long> {
    List<TimerEntity> findAllByEmail(String userEmail);
}
>>>>>>> d0cd6e2ceeeb75a71fd1707bb05f98092e3f4db3
