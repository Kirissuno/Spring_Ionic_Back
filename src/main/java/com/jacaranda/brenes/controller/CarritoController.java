package com.jacaranda.brenes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.brenes.service.CarritoService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping("/")
public class CarritoController {
	
	@Autowired
	private CarritoService carritoService;

}
