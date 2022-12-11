package com.example.bookmarker.dto;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookmarkDTO extends AbstractDTO<Long> {

    private String title;
    private String url;
    private Instant createdAt;

    public BookmarkDTO(Long id, String title, String url, Instant createdAt) {
        super(id);
        this.title = title;
        this.url = url;
        this.createdAt = createdAt;
    }
}