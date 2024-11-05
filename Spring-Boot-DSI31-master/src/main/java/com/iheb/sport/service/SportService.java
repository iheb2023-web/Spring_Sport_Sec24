package com.iheb.sport.service;

import java.util.Date;
import java.util.List;

import com.iheb.sport.dto.SportDTO;
import com.iheb.sport.entities.Genre;
import com.iheb.sport.entities.sport;

public interface SportService {
	//SportDTO saveSport(sport s);
	sport saveSport(sport s);
	//SportDTO updateSport(sport s);
	sport updateSport(sport s);
	sport getSport(long id);
	List<sport> getAllSport();
	void deletSport(sport s);
	void deletSportById(long id);
	List<sport>findByNomSport(String nom);
	List<sport>findByNomSportContains(String nom);
	List<sport>findByNomDate(String nom, int date);
	List<sport>findByGenre(Genre genre);
	List<sport>findByGenreIdGen(Long id);
	List<sport>findByOrderByNomSportAsc();
	List<sport>trierSportNomDate();

	SportDTO convertEntityToDto (sport sp);
	sport convertDtoToEntity(SportDTO sdt);

	Genre saveGenre(Genre s);

}
