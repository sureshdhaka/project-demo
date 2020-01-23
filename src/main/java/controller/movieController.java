package controller;
import java.util.ArrayList;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.movies;
import service.moviesService;

@CrossOrigin
@RestController
@RequestMapping("/movies/search/j")


public class movieController {
	@Autowired
	moviesService ps;

	
	
	

	@RequestMapping("{id}")
	public movies getPerson(@PathVariable("id") String id) {
		return ps.getPerson(id);
	}

}
