package com.training.courseservice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.courseservice1.model.Course;


public interface CourseRepository extends JpaRepository<Course, Long>{

}
