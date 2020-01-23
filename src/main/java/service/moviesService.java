package service;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import model.movies;


@Service
public class moviesService {
	ArrayList<movies> persons = new ArrayList<movies>();
	
	public moviesService() {
		movies p = new movies();
		p.setId("2");
		p.setMoviename("[jumanji]");
		p.setSearchname("[jurassic park]");
		persons.add(p);
		
		
		p.setId("3");
		
		p.setMoviename("[the dark knight], [the exascist]");
		
		p.setSearchname("[the monster]");
		persons.add(p);
        p.setId("m");
		
		p.setMoviename("[the dark knight], [the exascist]");
		
		p.setSearchname("[the monster]");
		persons.add(p);
		
		
			}
	public movies getPerson(String id) {
		for(movies person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	
	public ArrayList<movies> getAll() {
		return persons;
	}
	
}
