package com.example.moviereviewdemo.repository;

import com.example.moviereviewdemo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
