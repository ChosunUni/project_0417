package com.suntime.study.controller;

import org.springframework.ui.Model;
import com.suntime.study.dto.TotaltimeDTO;
import com.suntime.study.service.TotalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TotaltimeController {
    private final TotalService totalService;
    public TotaltimeController(TotalService totalService) {
        this.totalService = totalService;
    }

    @GetMapping("/total")
    public String getTotalTime(Model model) {
        TotaltimeDTO totaltimeDTO = totalService.calculateTotalTime();
        model.addAttribute("totalTime", totaltimeDTO.getFormattedTime());
        return "total";
    }
}
