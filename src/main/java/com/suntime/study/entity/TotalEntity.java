package com.suntime.study.entity;

import com.suntime.study.dto.TotaltimeDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "total_table")
public class TotalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer totalHours;

    @Column
    private Integer totalMinutes;

    @Column
    private Integer totalSeconds;
}
