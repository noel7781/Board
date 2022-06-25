package com.noel.board.entity;

import com.noel.board.Enum.BoardKind;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "posts")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="POST_ID")
    private Long id;

    @Enumerated(EnumType.STRING)
    private BoardKind kind;

    @Column(length = 255)
    private String title;

    @Column(length = 65535)
    private String content;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User author;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    private String createdAt;

    private String updatedAt;


    public void setBoardKind(BoardKind boardKind) {
        this.kind = boardKind;
    }

    public BoardKind getBoardKind() {
        return kind;
    }
}
