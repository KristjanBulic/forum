package com.forum.forumweb.dtos.model;

import lombok.Data;

import java.util.Date;

@Data
public class PostDTO {
    private Integer id;
    private String title;
    private String text;
    private Date postTime;
    private Integer userId;
}
