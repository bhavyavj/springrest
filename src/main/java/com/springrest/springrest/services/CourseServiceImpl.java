package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{
//    List<Course> list;
    @Autowired
    private CourseDao courseDao;
//    public CourseServiceImpl(){
//        list=new ArrayList<>();
//        list.add(new Course(111,"Java","this is java"));
//        list.add(new Course(222,"SpringBoot","this is SB"));
//    }



    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

        return courseDao.getOne(courseId);
    }
    @Override
    public Course addCourse(Course course) {
       courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course){

        courseDao.save(course);
        return course;
    }
    @Override
    public void deleteCourse(long parseLong){
        Course c=courseDao.getReferenceById(parseLong);
        courseDao.delete(c);

    }
}
