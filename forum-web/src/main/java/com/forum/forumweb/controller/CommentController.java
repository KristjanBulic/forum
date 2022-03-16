package com.forum.forumweb.controller;

import com.forum.forumweb.model.Comment;
import com.forum.forumweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/comment/post/{postId}")
    public ResponseEntity<List<Comment>> getCommentsForPost(@PathVariable("postId") Integer postId){
        return ResponseEntity.ok(commentService.getCommentsForPost(postId));
    }

    @PostMapping("/comment/post")
    public ResponseEntity<Comment> commentPost(@PathVariable("postId") Integer postId, @RequestBody Comment comment){
        commentService.saveComment(comment);
        return ResponseEntity.ok(comment);
    }
}
