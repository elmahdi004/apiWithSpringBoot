package com.example.createApiDemo.repositories;

import com.example.createApiDemo.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    public Teacher findByName(String name);
    public Teacher findByNameContaining(String name);
}
