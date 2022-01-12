package com.surfersolution.ssmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.ssmovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
