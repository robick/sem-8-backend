package com.robick.sem8.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robick.sem8.project.dto.AddEventDto;
import com.robick.sem8.project.dto.ResponseDto;
import com.robick.sem8.project.model.Event;

@RestController
@RequestMapping("/lben")
public class projectController{
	@PostMapping(value="/addEvent")
	public ResponseEntity<ResponseDto> addEvent(@RequestBody AddEventDto addEventDto){
		ResponseDto responseDto=new ResponseDto();
		return new ResponseEntity<>(responseDto,HttpStatus.OK) ;
	}
	
	@GetMapping(value="/getEvents")
	public ResponseEntity<List<Event>> getAllEvent(){
		List<Event> events=new ArrayList<>();
		return new ResponseEntity<>(events,HttpStatus.OK) ;
	}
	
	@GetMapping(value="/getEventById")
	public ResponseEntity<List<Event>> getEventById(){
		List<Event> events=new ArrayList<>();
		return new ResponseEntity<>(events,HttpStatus.OK) ;
	}
}
