package com.iheb.sport.restController;


import com.iheb.sport.dto.SportDTO;
import com.iheb.sport.entities.Genre;
import com.iheb.sport.repos.GenreRepository;
import com.iheb.sport.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gen")
@CrossOrigin("*")
public class GenreRestController {
    @Autowired
    GenreRepository genreRepository;

    @Autowired
    SportService sportService;

    @RequestMapping(method= RequestMethod.GET)
    public List<Genre> getAllGenres()
    {
        return genreRepository.findAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Genre getGenreById(@PathVariable("id") Long id) {
        return genreRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Genre createGenre(@RequestBody Genre sp) {
        return sportService.saveGenre(sp)
                ;	}


}
