package com.example.moviereviewdemo.repository;

import com.example.moviereviewdemo.entity.MovieImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long> {
}
