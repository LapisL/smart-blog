package com.blog.guest.domain.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blog.guest.domain.posts.dto.PostsDto;
import com.blog.guest.domain.posts.PostsFactory;
import com.blog.guest.domain.posts.PostsService;


@RestController
@RequestMapping("/article")
@CrossOrigin
public class PostsController {

    @Autowired PostsFactory postsFactory;

    @Autowired PostsService postsService;

    //全件取得
    @GetMapping("/list")
    public List<PostsDto> getPostList() {
        return postsFactory.createArticleListResponse(postsService.getAll());
    }

    //一件取得
    @GetMapping("/{id}")
    public PostsDto getArticle(@PathVariable("id") int postId){
        return postsFactory.createArticleResponse(postsService.getPost(postId));
    }

    //登録

    //更新

    //削除

}
