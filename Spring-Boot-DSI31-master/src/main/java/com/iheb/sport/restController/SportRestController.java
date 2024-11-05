package com.iheb.sport.restController;

import java.util.List;

import com.iheb.sport.dto.SportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iheb.sport.entities.sport;
import com.iheb.sport.service.SportService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SportRestController {
	@Autowired
	SportService sportService;

	@RequestMapping(path="all",method =RequestMethod.GET)
	public List<sport> getAllSports(){

		return sportService.getAllSport();
	}

	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)

	public sport getSportById(@PathVariable("id") Long id) {

		return sportService.getSport(id);
	}

	@RequestMapping(path="/addsport",method = RequestMethod.POST)
	//@PreAuthorize("hasAuthority('ADMIN')")  fonctionne avec @EnableMethodSecurity(prePostEnabled = true) dans securityconfig
	public sport createSport(@RequestBody sport sp) {
		return sportService.saveSport(sp)
;	}

	@RequestMapping(path="/updatesport",method = RequestMethod.PUT)
	public sport updateSport(@RequestBody sport sp) {

		return sportService.updateSport(sp);
	}

	@RequestMapping(value="/delsport/{id}",method = RequestMethod.DELETE)
	public void deleteSport(@PathVariable("id") Long id) {

		sportService.deletSportById(id);
	}

	@RequestMapping(value = "/sportsgen/{idGen}", method = RequestMethod.GET)
	public List<sport> getSportByCatId(@PathVariable("idGen") Long idGen) {

		return sportService.findByGenreIdGen(idGen);
	}

	@RequestMapping(value="/sportByName/{nom}",method = RequestMethod.GET)
	public List<sport> findByNomSportContains(@PathVariable("nom") String nom) {
		return sportService.findByNomSport(nom);
	}
	

}
