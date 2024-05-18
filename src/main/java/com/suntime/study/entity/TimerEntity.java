<<<<<<< HEAD
package com.suntime.study.entity;

import com.suntime.study.dto.TimerDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "subject_table")
public class TimerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String subject;

    @Column
    private Integer hours;

    @Column
    private Integer minutes;

    @Column
    private Integer seconds;

    public static TimerEntity toTimerEntity(TimerDTO timerDTO){
        TimerEntity timerEntity = new TimerEntity();
        timerEntity.setEmail(timerDTO.getEmail());
        timerEntity.setSubject(timerDTO.getSubject());
        return timerEntity;
    }
}
=======
package com.suntime.study.entity;

import com.suntime.study.dto.TimerDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "subject_table")
public class TimerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String subject;

    @Column
    private Integer hours;

    @Column
    private Integer minutes;

    @Column
    private Integer seconds;

    public static TimerEntity toTimerEntity(TimerDTO timerDTO){
        TimerEntity timerEntity = new TimerEntity();
        timerEntity.setEmail(timerDTO.getEmail());
        timerEntity.setSubject(timerDTO.getSubject());
        return timerEntity;
    }
}
>>>>>>> d0cd6e2ceeeb75a71fd1707bb05f98092e3f4db3
