package com.surfersolution.ssmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.ssmovies.entities.Score;
import com.surfersolution.ssmovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
