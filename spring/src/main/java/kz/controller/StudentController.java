package kz.controller;

import kz.dao.StudentDao;
import kz.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping(path="/{id}", produces = "application/json")
    public Student getEmployees(@PathVariable("id") int id)
    {
        return studentDao.getStudent(id);
    }
}
