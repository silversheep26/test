package com.example.miniproject.dto;

import com.example.miniproject.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostResponseDto {
    private String title;
    private String writer;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime lastmodifiedDate;

    public PostResponseDto(Post post) {
        this.title = post.getTitle();
        this.writer = post.getWriter();
        this.content = post.getContent();
        this.createdDate = post.getCreatedDate();
        this.lastmodifiedDate = post.getLastmodifiedDate();
    }
}
