package com.example.moviereviewdemo.repository;

import com.example.moviereviewdemo.entity.Member;
import com.example.moviereviewdemo.entity.Movie;
import com.example.moviereviewdemo.entity.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReviewRepositoryTest {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews(){

        IntStream.rangeClosed(1, 200).forEach(i -> {

            Long mno = (long)(Math.random()*100) + 1;

            Long mid = (long)(Math.random()*100) + 1;
            Member member = Member.builder().mid(mid).build();

            Review movieReview = Review.builder()
                    .member(member)
                    .movie(Movie.builder().mno(mno).build())
                    .grade((int)(Math.random() * 5) + 1)
                    .text("이 영화에 대한 느낌..."+i)
                    .build();

            reviewRepository.save(movieReview);

        });

    }
}