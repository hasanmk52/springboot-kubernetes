package com.example.bookmarker.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AbstractDTO<E> {

    private E id;

    public AbstractDTO(E id) {
        this.id = id;
    }
}