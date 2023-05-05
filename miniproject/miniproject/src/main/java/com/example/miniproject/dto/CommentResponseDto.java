package com.example.miniproject.dto;

import com.example.miniproject.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CommentResponseDto {
    private String writer;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime lastmodifiedDate;


    public CommentResponseDto(Comment comment) {
        this.writer = comment.getWriter();
        this.content = comment.getContent();
        this.createdDate = comment.getCreatedDate();
        this.lastmodifiedDate = comment.getLastmodifiedDate();

    }
}

