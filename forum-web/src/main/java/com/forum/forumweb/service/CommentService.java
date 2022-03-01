package com.forum.forumweb.service;

import com.forum.forumweb.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;
}
