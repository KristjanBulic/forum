package com.forum.forumweb.service;

import com.forum.forumweb.model.Post;
import com.forum.forumweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getPosts(Specification<Post> specs) {
        return postRepository.findAll(specs);
    }

    public int savePost(Post post) {
        Post returnedPost = postRepository.save(post);
        return returnedPost.getId();
    }
}
