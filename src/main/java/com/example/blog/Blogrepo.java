package com.example.blog;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Blogrepo extends JpaRepository<Blogposts, Long> {
}
