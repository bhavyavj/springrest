package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(111,"Java","this is java"));
        list.add(new Course(222,"SpringBoot","this is SB"));
    }



    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }
    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}