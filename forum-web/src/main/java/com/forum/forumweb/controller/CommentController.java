package com.forum.forumweb.controller;

import com.forum.forumweb.dtos.model.CommentDTO;
import com.forum.forumweb.dtos.model.CommentSaveDTO;
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
    public ResponseEntity<List<CommentDTO>> getCommentsForPost(@PathVariable("postId") Integer postId){
        return ResponseEntity.ok(commentService.getCommentsForPost(postId));
    }

    @PostMapping("/comment/post/{postId}")
    public ResponseEntity<CommentDTO> commentPost(@PathVariable("postId") Integer postId, @RequestBody CommentSaveDTO comment){
        return ResponseEntity.ok(commentService.saveComment(comment));
    }
}
