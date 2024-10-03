package org.example.controller;

import org.example.Service.CourseService;
import org.example.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourse(@PathVariable("id") int id){
        return courseService.getCourse(id);
    }

    @PutMapping("/{id}")
    public boolean updateCourse(@PathVariable("id") int id, @RequestBody Course newCourse){
        return courseService.updateCourse(id, newCourse);
    }
}
