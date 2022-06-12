package com.springbootjpatest.springbootjpatest.repository;
import com.springbootjpatest.springbootjpatest.SpringbootjpatestApplication;
import com.springbootjpatest.springbootjpatest.config.AppConfiguration;
import com.springbootjpatest.springbootjpatest.entity.Todo;
import com.springbootjpatest.springbootjpatest.service.CourseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.sql.DataSource;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = SpringbootjpatestApplication.class)
class TodoRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private TodoRepository todoRepository;

    @Test
    void injectedComponentsAreNotNull(){
        assertNotNull(dataSource);
        assertNotNull(jdbcTemplate);
        assertNotNull(entityManager);
        assertNotNull(todoRepository);
    }

    @Test
    void whenSaved_thenFindsAll() {

        Todo todo = new Todo();

        Todo todo1 = getTodo(1l, "wake up", "wake up at 6 am ", 1l);
        Todo todo2 = getTodo(1l, "brush teeth", "brush teeth ", 2l);
        Todo todo3 = getTodo(1l, "hair", "comb hair", 3l);
        Todo todo4 = getTodo(1l, "shower", "have shower ", 4l);
        Todo todo5 = getTodo(1l, "breakfast", "have breakfast ", 5l);

        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);
        todoRepository.save(todo5);

        assertEquals(5,todoRepository.findAll().size());

    }

    static Todo getTodo(Long version, String title, String description, Long id){
        Todo todo = new Todo();
        todo.setVersion(version);
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setId(id);
        return todo;
    }
}