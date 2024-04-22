package com.sirine.series.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.sirine.series.entities.Serie;

public interface SerieService {
	
	Serie saveSerie(Serie s);
	Serie updateSerie(Serie s);
	void deleteSerie(Serie s);
	void deleteSerieById(Long idS);
	Serie getSerie(Long idS);
	List<Serie> getAllSeries();
	Page<Serie> getAllSeriesParPage(int page, int size);
}
