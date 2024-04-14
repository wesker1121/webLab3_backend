package cn.edu.hit.lab3.controller;

import cn.edu.hit.lab3.entity.Student;
import cn.edu.hit.lab3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/list")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
