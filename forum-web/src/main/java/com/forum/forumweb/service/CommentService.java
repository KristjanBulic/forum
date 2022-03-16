package com.forum.forumweb.service;

import com.forum.forumweb.model.Comment;
import com.forum.forumweb.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public List<Comment> getCommentsForPost(int postId){
        return commentRepository.findAllByPostId(postId);
    }

    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }
}
