package com.forum.forumweb.controller;

import com.forum.forumweb.model.Post;
import com.forum.forumweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts(Specification<Post> specs){
        return ResponseEntity.ok(postService.getPosts(specs));
    }
}
