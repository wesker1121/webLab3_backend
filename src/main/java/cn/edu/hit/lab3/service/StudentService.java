package cn.edu.hit.lab3.service;

import cn.edu.hit.lab3.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void delete(String sid);
}
