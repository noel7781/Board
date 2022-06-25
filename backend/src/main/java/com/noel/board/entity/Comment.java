package com.noel.board.entity;

import javax.persistence.*;

@Entity(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COMMENT_ID")
    private Long id;

    private Long parent_id;

    @Column(length = 511)
    private String content;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User author;

    @ManyToOne
    @JoinColumn(name = "POST_ID")
    private Post post;

}
