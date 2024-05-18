package com.suntime.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "todo_table")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

<<<<<<< HEAD
=======
    @Column
    private String email;

>>>>>>> d0cd6e2ceeeb75a71fd1707bb05f98092e3f4db3
    @Column(length = 200)
    private String content;

    @Column(nullable = false, columnDefinition = "INTEGER DEFAULT 0")
    private Integer completed;
}