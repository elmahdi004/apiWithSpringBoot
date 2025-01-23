package com.example.createApiDemo.services;

import com.example.createApiDemo.entities.Teacher;
import com.example.createApiDemo.repositories.TeacherRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    private TeacherRepository teacherRepository;
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
 @Transactional
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    @Transactional
    public List<Teacher> teachers(){
        return teacherRepository.findAll();
    }
}
