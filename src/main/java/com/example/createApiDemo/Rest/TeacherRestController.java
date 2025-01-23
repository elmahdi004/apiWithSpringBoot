package com.example.createApiDemo.Rest;


import com.example.createApiDemo.entities.Teacher;
import com.example.createApiDemo.services.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherRestController {
    private TeacherService teacherService;
    public TeacherRestController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<Teacher> teachers(){
        return teacherService.teachers();
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher){
        return  teacherService.createTeacher(teacher);
    }

}
