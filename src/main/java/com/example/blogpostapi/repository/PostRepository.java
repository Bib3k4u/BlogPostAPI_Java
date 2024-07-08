package com.example.blogpostapi.repository;

import com.example.blogpostapi.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
