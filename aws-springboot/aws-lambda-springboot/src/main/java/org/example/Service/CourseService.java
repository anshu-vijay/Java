package org.example.Service;

import org.example.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }
    public List<Course> getAllCourses() {
        return courses;
    }

    public Optional<Course> getCourse(int id){
        return courses.stream().filter(course -> course.getId() == id).findFirst();
    }

    public boolean updateCourse(int id, Course newCourse){
        return getCourse(id).map(existingCourse -> {
            courses.remove(existingCourse);
            courses.add(newCourse);
            return true;
        }).orElse(false);
    }

    public void deleteCourse(int id){
        courses.removeIf(course -> course.getId() == id);
    }
}
