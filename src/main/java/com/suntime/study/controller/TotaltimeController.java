package com.suntime.study.controller;

import org.springframework.ui.Model;

import com.suntime.study.dto.MemberDTO;
import com.suntime.study.dto.TotaltimeDTO;
import com.suntime.study.service.TotalService;
import jakarta.servlet.http.HttpServletRequest; // HttpServletRequest import �߰�
import jakarta.servlet.http.HttpSession;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TotaltimeController {
    private final TotalService totalService;
    public TotaltimeController(TotalService totalService) {
        this.totalService = totalService;
    }

    @GetMapping("/total")
    public String getTotalTime(Model model, HttpServletRequest request) { // HttpServletRequest �Ű����� �߰�
        HttpSession session = request.getSession(); // ���� ��ü ��������
        MemberDTO loginMember = (MemberDTO) session.getAttribute("loginMember");
        String email = loginMember.getMemberEmail();
        TotaltimeDTO totaltimeDTO = totalService.calculateTotalTime(email);
        model.addAttribute("totalTime", totaltimeDTO.getFormattedTime());
        return "total";
    }
}
