package com.example.createApiDemo.services;

import com.example.createApiDemo.entities.Teacher;
import com.example.createApiDemo.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherRepository teacherRepository;
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
