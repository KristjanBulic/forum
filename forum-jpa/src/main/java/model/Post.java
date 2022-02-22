package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "T_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "POST_TIME")
    private Date postTime;

    @Column(name = "FILE_URL")
    private String fileUrl;

    @Column(name = "USER_ID")
    private Integer userId;
}
