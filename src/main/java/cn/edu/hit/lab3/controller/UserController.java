package cn.edu.hit.lab3.controller;

import cn.edu.hit.lab3.entity.User;
import cn.edu.hit.lab3.util.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Result login(User user) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("456")) {
            return Result.ok("success");
        } else {
            return Result.fail("fail");
        }
    }
}
