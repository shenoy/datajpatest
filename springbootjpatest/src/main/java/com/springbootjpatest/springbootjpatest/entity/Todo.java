package com.springbootjpatest.springbootjpatest.entity;



import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public final class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Version
    private long version;
    //The constructor, builder, and other methods are omitted
}