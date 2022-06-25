package com.noel.board.dto;

import com.noel.board.Enum.BoardKind;
import com.noel.board.entity.Post;
import com.noel.board.entity.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
public class PostDto {

    private static final Logger logger = LoggerFactory.getLogger(PostDto.class);

    private Long id;
    private BoardKind kind;
    private String title;
    private String content;
    private String author;
    private String createdAt;
    private String updatedAt;

    public BoardKind getBoardKind() {
        return kind;
    }

    public void setBoardKind(BoardKind boardKind) {
        this.kind = boardKind;
    }
}
