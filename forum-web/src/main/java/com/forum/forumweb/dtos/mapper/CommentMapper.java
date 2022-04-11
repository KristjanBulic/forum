package com.forum.forumweb.dtos.mapper;

import com.forum.forumweb.dtos.model.CommentDTO;
import com.forum.forumweb.dtos.model.CommentSaveDTO;
import com.forum.forumweb.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CommentMapper {

    @Mappings({
            @Mapping(source = "text", target = "text"),
            @Mapping(source = "userName", target = "userName")
    })
    public Comment toEntity(CommentSaveDTO dto);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "text", target = "text"),
            @Mapping(source = "postTime", target = "postTime"),
            @Mapping(source = "userName", target = "userName"),
            @Mapping(source = "postId", target = "postId"),
    })
    public CommentDTO toDTO(Comment comment);
}
