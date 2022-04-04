package com.forum.forumweb.service;

import com.forum.forumweb.dtos.mapper.PostMapper;
import com.forum.forumweb.dtos.model.PostDTO;
import com.forum.forumweb.dtos.model.PostSaveDTO;
import com.forum.forumweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostMapper postMapper;

    public List<PostDTO> getPosts() {
        return postRepository.findAll().stream().map(x -> postMapper.toPostDTO(x)).collect(Collectors.toList());
    }

    public int savePost(final PostSaveDTO post) {
        final var returnedPost = postRepository.save(postMapper.toEntity(post));
        return returnedPost.getId();
    }
}
