package com.noel.board.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AUTHOR_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

}
