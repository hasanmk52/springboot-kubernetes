package com.example.bookmarker.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CreateBookmarkRequest {
    @NotEmpty(message = "Title should not be empty")
    private String title;
    @NotEmpty(message = "Url should not be empty")
    private String url;
}
