package com.forum.forumweb.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.File;
import java.util.Date;

@Data
@Entity
@Table(name = "T_POST")
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TEXT")
    private String text;

    @CreationTimestamp
    @Column(name = "POST_TIME")
    private Date postTime;

    @Column(name = "USER_ID")
    private Integer userId;
}
