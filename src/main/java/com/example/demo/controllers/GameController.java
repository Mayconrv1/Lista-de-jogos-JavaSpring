package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GameMinDTO;
import com.example.demo.services.GameService;

@RestController
@RequestMapping(value= "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.finAll();
		return result;
		
	}
}
