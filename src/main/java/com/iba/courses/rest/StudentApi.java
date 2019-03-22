package com.iba.courses.rest;


import com.iba.courses.domain.Student;
import com.iba.courses.repository.StudentRepository;
import com.iba.courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentApi {

    @Autowired
    StudentService service;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/greeting")
    private String greeting() {
        System.out.println("REST");
        return "Hello";
    }
    @GetMapping("/getallstudents")
    private List<Student> getAllStudents() {
        System.out.println("get all");

        return service.getAllStudents();
    }
    @GetMapping("/greet/{myVariable}")
    private String greet(@PathVariable String myVariable) {
        System.out.println("greet");
        return "Hello " + myVariable;
    }
    @PostMapping("/simplePost/{id}")
    private int postMethod(@RequestBody String s,@PathVariable int id) {
        System.out.println("post tut " + s + " " + id);
        return id;
    }

    @PostMapping("/new")
    private void saveNewStudent(@RequestBody Student student) {
        System.out.println(student);
        studentRepository.save(student);
    }
}
