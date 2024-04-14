package cn.edu.hit.lab3.service.impl;

import cn.edu.hit.lab3.entity.Student;
import cn.edu.hit.lab3.mapper.StudentMapper;
import cn.edu.hit.lab3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
