package com.suntime.study.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TotaltimeDTO {
    private int totalHours;
    private int totalMinutes;
    private int totalSeconds;

    public TotaltimeDTO(int totalHours, int totalMinutes, int totalSeconds) {
        this.totalHours = totalHours;
        this.totalMinutes = totalMinutes;
        this.totalSeconds = totalSeconds;
    }

    // 다른 TimerDTO 리스트를 받아서 누적된 시간을 계산하는 메소드
    public static TotaltimeDTO calculateTotalTimeFromTimerDTOList(List<TimerDTO> timerDTOList) {
        int totalHours = 0;
        int totalMinutes = 0;
        int totalSeconds = 0;

        // 각 TimerDTO의 시간을 누적
        for (TimerDTO timerDTO : timerDTOList) {
            totalHours += timerDTO.getHours();
            totalMinutes += timerDTO.getMinutes();
            totalSeconds += timerDTO.getSeconds();
        }

        // 초를 분과 시간으로 변환
        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;

        totalHours += totalMinutes / 60;
        totalMinutes %= 60;

        return new TotaltimeDTO(totalHours, totalMinutes, totalSeconds);
    }
    public String getFormattedTime() {
        return String.format("%02d:%02d:%02d", totalHours, totalMinutes, totalSeconds);
    }


}
