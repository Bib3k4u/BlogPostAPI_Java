package com.example.blogpostapi.controller;

import com.example.blogpostapi.model.Post;
import com.example.blogpostapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "false")
class PostController {
    @Autowired
    PostService postService;

    @PostMapping
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @GetMapping
    List<Post> findAllPosts(){
        return postService.getAllPosts();
    }

}
