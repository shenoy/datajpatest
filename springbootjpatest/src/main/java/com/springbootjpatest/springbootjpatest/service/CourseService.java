package com.springbootjpatest.springbootjpatest.service;

import com.springbootjpatest.springbootjpatest.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Todo> list();
    void save(Todo todo);
}
