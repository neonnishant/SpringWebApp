package com.example.demo.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/Main")
public class Main {

	@RequestMapping("/getName")
	public List<NameDTO> getName() throws JsonProcessingException {
		List<NameDTO> allnames = new ArrayList<NameDTO>();
		allnames.add(new NameDTO("Neon", 28));
		allnames.add(new NameDTO("Pankaj", 60));
		ObjectMapper mapper=new ObjectMapper();
		//return mapper.writeValueAsString(allnames);
		return allnames;
	}
}
