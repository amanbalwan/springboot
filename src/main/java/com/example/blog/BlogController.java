package com.example.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private Blogrepo blogPostRepository;

    @GetMapping("/list")
    public String listBlogPosts(Model model) {
        List<Blogposts> blogPosts = blogPostRepository.findAll();
        model.addAttribute("blogposts", blogPosts);
        return "blog/list";
    }
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("blogposts", new Blogposts());
        return "blog/add";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
    	Blogposts blogPost = blogPostRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid blog post ID"));
        model.addAttribute("blogposts", blogPost);
        return "blog/edit";
    }


}


