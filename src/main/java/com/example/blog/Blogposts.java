package com.example.blog;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@jakarta.persistence.Entity
public class Blogposts {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    }
