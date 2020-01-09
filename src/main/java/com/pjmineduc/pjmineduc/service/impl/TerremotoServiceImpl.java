package com.pjmineduc.pjmineduc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pjmineduc.pjmineduc.entity.*;
import com.pjmineduc.pjmineduc.service.*;
import com.pjmineduc.pjmineduc.repository.*;

@Service
public class TerremotoServiceImpl  implements TerremotoService{
	 @Autowired
	 private TerremotoRepository terremotoRepository;
	 
	 public void setEmployeeRepository(TerremotoRepository terremotoRepository) {
	  this.terremotoRepository = terremotoRepository;
	 }
	  
	 public List<Terremotos> retrieveTerremotos() {
	  List<Terremotos> terremotos = terremotoRepository.findAll();
	  return terremotos;
	 }
	 
	 public Terremotos getTerremotos(Long terremotosId) {
		  Optional<Terremotos> optEmp = terremotoRepository.findById(terremotosId);
		  return optEmp.get();
	 }
		  
	 public void saveTerremoto(Terremotos terremotos){
		 terremotoRepository.save(terremotos);
	 }
	 
	 public Terremotos getTerr(Long terremotosId) {
		  return terremotoRepository.findById(terremotosId).get();
	 }
}
