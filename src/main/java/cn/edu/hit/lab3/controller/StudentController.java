package cn.edu.hit.lab3.controller;

import cn.edu.hit.lab3.entity.Student;
import cn.edu.hit.lab3.service.StudentService;
import cn.edu.hit.lab3.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{sid}")
    public Result delete(@PathVariable String sid) {
        studentService.delete(sid);
        return Result.ok("success");
    }
}
