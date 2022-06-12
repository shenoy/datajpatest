package com.springbootjpatest.springbootjpatest.repository;

import com.springbootjpatest.springbootjpatest.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    void delete(Todo deleted);
    List<Todo> findAll();
    Todo save(Todo persisted);

}