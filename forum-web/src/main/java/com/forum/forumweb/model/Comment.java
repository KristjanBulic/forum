package com.forum.forumweb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "T_COMMENT")
public class Comment {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "POST_TIME")
    private Date postTime;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "T_POST_ID")
    private Integer postId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "FILE_URL")
    private String fileUrl;
}
