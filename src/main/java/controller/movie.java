package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.movies;
import service.moviesService;

@CrossOrigin
@RestController
@RequestMapping("/movies")

public class movie {
	@Autowired
	moviesService ps;

	
	
	

	@RequestMapping("{id3}")
	public movies getPerson(@PathVariable("id3") String id) {
		return ps.getPerson(id);
	}

}
