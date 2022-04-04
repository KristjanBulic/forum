package com.forum.forumweb.dtos.mapper;

import com.forum.forumweb.dtos.model.PostDTO;
import com.forum.forumweb.dtos.model.PostSaveDTO;
import com.forum.forumweb.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PostMapper {
    @Mappings({
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "text", target = "text")
    })
    Post toEntity(PostSaveDTO postDTO);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "text", target = "text"),
            @Mapping(source = "postTime", target = "postTime"),
            @Mapping(source = "userId", target = "userId"),
    })
    PostDTO toPostDTO(Post post);
}
