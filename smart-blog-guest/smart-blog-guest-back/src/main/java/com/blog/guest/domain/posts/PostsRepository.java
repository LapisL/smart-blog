package com.blog.guest.domain.posts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.posts.PostsEntity;

@Repository
public interface PostsRepository extends CrudRepository<PostsEntity, Integer> {

    @Query(
        value = 
          "SELECT "
            + "DISTINCT posts "
            + "FROM "
            + "PostsEntity posts")
    public List<PostsEntity> findAllOrderByAsc();
}
