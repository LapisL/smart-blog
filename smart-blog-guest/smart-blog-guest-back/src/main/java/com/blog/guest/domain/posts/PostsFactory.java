package com.blog.guest.domain.posts;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.blog.entity.posts.PostsEntity;
import com.blog.guest.domain.posts.dto.PostsDto;

public class PostsFactory {
    
    @Autowired private ModelMapper mapper;

    public List<PostsDto> createArticleListResponse(List<PostsEntity> list){
        List<PostsDto> resList = list.stream().map(postEntity -> mapper.map(postEntity, PostsDto.class))
                .collect(Collectors.toList());

        return resList;
    }

    public PostsDto createArticleResponse(Optional<PostsEntity> optional){
        return mapper.map(optional, PostsDto.class);
    }
    
}
