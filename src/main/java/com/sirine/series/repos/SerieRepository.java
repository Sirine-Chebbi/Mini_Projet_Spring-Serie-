package com.sirine.series.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirine.series.entities.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {

}
