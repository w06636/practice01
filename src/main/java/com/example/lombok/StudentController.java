package com.example.lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/test")
    public String test() {

    	// test
        Student student = new Student();
        student.setId(1);
        student.setName("123");

        return student.getName();
    }
}
