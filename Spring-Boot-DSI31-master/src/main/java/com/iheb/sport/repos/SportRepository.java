package com.iheb.sport.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iheb.sport.entities.Genre;
import com.iheb.sport.entities.sport;

@RepositoryRestResource(path = "rest")
public interface SportRepository extends JpaRepository<sport, Long> {
    List<sport> findByNomSport(String nom);
    List<sport> findByNomSportContains(String nom);
    
    @Query("SELECT s FROM sport s WHERE s.nomSport LIKE %?1 And EXTRACT(YEAR FROM s.dateFondation) > 2")
    List<sport> findByNomAndYear(String nom, int annee);
    
    @Query("SELECT s FROM sport s WHERE s.nomSport LIKE %:nom% AND EXTRACT(YEAR FROM s.dateFondation) > :annee")
    List<sport> findByNomAndYearAfter(
        @Param("nom") String nom,
        @Param("annee") int annee
    );
    
    @Query("select s from sport s where s.genre = ?1")
    List<sport> findByGenre (Genre gen);
    
    List<sport> findByGenreIdGen(Long id);
    
    List<sport> findByOrderByNomSportAsc();
    
    @Query("select p from sport p order by p.nomSport ASC, p.dateFondation DESC")
    List<sport> trierSportsNomsDateFondation ();



}

