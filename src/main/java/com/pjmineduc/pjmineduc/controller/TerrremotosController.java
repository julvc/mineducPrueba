package com.pjmineduc.pjmineduc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pjmineduc.pjmineduc.entity.Terremotos;
import com.pjmineduc.pjmineduc.service.TerremotoService;

@RestController
public class TerrremotosController {
	
	@Autowired
	private TerremotoService terremotoService;
	
	public void setTerremotoService(TerremotoService terremotoService) {
		this.terremotoService = terremotoService;
	}
	
	@GetMapping("/api/terremotos")
	public List<Terremotos> getTerremotos() {
	  Date fechaInicial 	= new Date(); 
	  Date fechaFinal		= new Date(); 
	  Double magInicial		=0.0;
	  Double finalInicial	=0.0;
	  
	  List<Terremotos> terremotos = terremotoService.retrieveTerremotos();
	  return terremotos;
	}
	
	 @GetMapping("/api/terremotos/{terremotosId}")
	 public Terremotos getTerremoto(@PathVariable(name="terremotosId")Long terremotosId) {
	  return terremotoService.getTerremotos(terremotosId);
	 }
	
	 @PostMapping("/api/terremotos")
	 public void saveTerremoto(Terremotos terremotos){
		 terremotoService.saveTerremoto(terremotos);
	 }
	 
	 @GetMapping("/api/terremotos/listado")
	 public void listadoTerremotos(@PathVariable(name="terremotosId")Long terremotosId) {
		 Terremotos temp = terremotoService.getTerr(terremotosId);
	 }
	
}
