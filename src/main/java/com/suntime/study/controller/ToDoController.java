package com.suntime.study.controller;

import com.suntime.study.entity.ToDoEntity;
import com.suntime.study.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping("/todo")
    public String list(Model model) {
        List<ToDoEntity> toDoEntityList = this.toDoService.getList();
        model.addAttribute("toDoEntityList", toDoEntityList);
        return "todolist";
    }

    @PostMapping("/todo/create")
    public String todoCreate(@RequestParam String content) {
        toDoService.create(content);
        return "redirect:/todo";
    }

    @PostMapping("/todo/delete/{idx}")
    public String todoDelete(@PathVariable Integer idx){
        this.toDoService.delete(idx);
        return "redirect:/todo";
    }

    @PostMapping("/todo/update/{idx}")
    public String todoUpdate(@PathVariable Integer idx, @RequestParam String content){
        this.toDoService.update(idx, content);
        return "redirect:/todo";
    }

    @PostMapping("/todo/change/{idx}")
    public String toggleTodoStatus(@PathVariable Integer idx) {
        ToDoEntity todo = this.toDoService.findById(idx);
        if (todo != null) {
            Integer currentStatus = todo.getCompleted();
            if (currentStatus != null) {
                this.toDoService.changeStatus(idx, currentStatus == 0 ? 1 : 0);
            }
        }
        return "redirect:/todo";
        
    }
}
