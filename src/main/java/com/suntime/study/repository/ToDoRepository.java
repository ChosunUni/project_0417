package com.suntime.study.repository;

import com.suntime.study.entity.ToDoEntity;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity,Integer> {
=======

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity,Integer> {
    List<ToDoEntity> findAllByEmail(String userEmail);
>>>>>>> d0cd6e2ceeeb75a71fd1707bb05f98092e3f4db3
}
