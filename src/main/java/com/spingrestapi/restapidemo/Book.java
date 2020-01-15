package com.spingrestapi.restapidemo;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "Books")
@EntityListeners(AuditingEntityListener.class)
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column(name ="book_name", nullable = false)
    private String bookName;

    @Column(name ="author", nullable = false)
    private String author;



}
