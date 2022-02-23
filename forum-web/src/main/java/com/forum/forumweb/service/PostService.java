package com.forum.forumweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PostRepository;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

}
