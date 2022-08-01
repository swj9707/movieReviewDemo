package com.example.moviereviewdemo.repository;

import com.example.moviereviewdemo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
