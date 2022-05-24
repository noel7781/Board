package com.noel_maiego.board.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private Long id;

    @Column(length = 255)
    private String title;

    @Column(length = 65535)
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

}
