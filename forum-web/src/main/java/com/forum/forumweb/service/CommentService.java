package com.forum.forumweb.service;

import com.forum.forumweb.dtos.mapper.CommentMapper;
import com.forum.forumweb.dtos.model.CommentDTO;
import com.forum.forumweb.dtos.model.CommentSaveDTO;
import com.forum.forumweb.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CommentMapper commentMapper;

    public List<CommentDTO> getCommentsForPost(int postId){
        return commentRepository.findAllByPostId(postId).stream().map(x -> commentMapper.toDTO(x)).collect(Collectors.toList());
    }

    public CommentDTO saveComment(CommentSaveDTO comment, Integer postId) {
        final var c = commentMapper.toEntity(comment);
        c.setPostId(postId);
        commentRepository.save(c);
        return commentMapper.toDTO(c);
    }
}
