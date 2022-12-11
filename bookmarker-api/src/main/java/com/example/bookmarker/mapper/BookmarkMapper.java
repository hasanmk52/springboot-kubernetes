package com.example.bookmarker.mapper;

import com.example.bookmarker.domain.Bookmark;
import com.example.bookmarker.dto.BookmarkDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookmarkMapper extends GenericMapper<Bookmark, BookmarkDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    Bookmark asEntity(BookmarkDTO dto);
}