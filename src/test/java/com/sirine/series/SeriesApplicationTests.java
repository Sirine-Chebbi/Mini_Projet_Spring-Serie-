package com.sirine.series;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.sirine.series.entities.Serie;
import com.sirine.series.repos.SerieRepository;
import com.sirine.series.service.SerieService;

@SpringBootTest
class SeriesApplicationTests {

	@Autowired
	private SerieRepository serieRepository;
	
	
	@Autowired
	SerieService serieService;
	
	  @Test
		public void testFindByNomProduitContains()
		 {
		
			Page<Serie>  series = serieService.getAllSeriesParPage(0,2);
			System.out.println(series.getSize());
			System.out.println(series.getTotalElements());
			System.out.println(series.getTotalPages());
			
			series.getContent().forEach(s -> {System.out.println(s.toString());
			                                 });	
			/*ou bien
			 for (Serie s : series)
			{
				System.out.println(s);
			} */
		 }

	
	
	@Test
	public void testCreateProduit() {
	Serie series = new Serie("hammady",1.0,new Date());
	serieRepository.save(series);
	}
	
	@Test
	public void testFindProduit()
	{
		Serie s = serieRepository.findById(1L).get();
		System.out.println(s);
	}
	
	@Test
	public void testUpdateProduit()
	{
		Serie s = serieRepository.findById(1L).get();
		s.setNbSerie(2.0);
		serieRepository.save(s);
	
	System.out.println(s);
	}
	
	@Test
	public void testDeleteProduit()
	{
		serieRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduits()
	{
		List<Serie> series = serieRepository.findAll();
		
		for (Serie s:series)
			 System.out.println(s);
		
	}
	
}
