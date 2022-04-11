package com.forum.forumweb.dtos.model;

import lombok.Data;

import java.util.Date;

@Data
public class CommentDTO {

    private Integer id;
    private String text;
    private Date postTime;
    private Integer postId;
    private String userName;
}
