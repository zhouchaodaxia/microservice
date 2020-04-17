package com.microservice.course.service;

import com.microservice.course.dto.CourseDTO;

import java.util.List;

/**
 * Created by Michael on 2017/11/3.
 */
public interface ICourseService {

    List<CourseDTO> courseList();
}
