package com.ohgiraffers.springeagles.lsh_blog.likes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends JpaRepository<LikesEntity, Integer> {
}