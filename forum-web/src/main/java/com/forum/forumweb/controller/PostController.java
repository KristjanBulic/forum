package com.forum.forumweb.controller;

import com.forum.forumweb.dtos.model.PostDTO;
import com.forum.forumweb.dtos.model.PostSaveDTO;
import com.forum.forumweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public ResponseEntity<List<PostDTO>> getPosts(){
        return ResponseEntity.ok(postService.getPosts());
    }

    @PostMapping("/new-post")
    public ResponseEntity<Integer> createNewPost(@RequestBody final PostSaveDTO post){
        final var id = postService.savePost(post);
        return ResponseEntity.ok(id);
    }
}
