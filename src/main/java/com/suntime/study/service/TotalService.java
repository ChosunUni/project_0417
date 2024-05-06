package com.suntime.study.service;

import com.suntime.study.dto.TimerDTO;
import com.suntime.study.dto.TotaltimeDTO;
import com.suntime.study.entity.TimerEntity;
import com.suntime.study.repository.TimerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
// 왜 커밋이 안되지//
@Service
@RequiredArgsConstructor
public class TotalService {
    private final TimerRepository timerRepository;

    // 총 누적 시간 계산 메소드
    public TotaltimeDTO calculateTotalTime(String email) {
        List<TimerEntity> timerEntities = timerRepository.findAllByEmail(email);

        // TimerEntity 리스트를 TimerDTO 리스트로 변환
        List<TimerDTO> timerDTOList = timerEntities.stream()
                .map(TimerDTO::fromTimerEntity)
                .collect(Collectors.toList());

        // TotaltimeDTO를 사용하여 누적 시간 계산
        return TotaltimeDTO.calculateTotalTimeFromTimerDTOList(timerDTOList);
    }

    // 필요한 다른 메소드 추가 가능
}
