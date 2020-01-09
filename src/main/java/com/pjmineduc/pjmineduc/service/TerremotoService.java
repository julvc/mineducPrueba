package com.pjmineduc.pjmineduc.service;

import java.util.List;
import com.pjmineduc.pjmineduc.entity.*;

public interface TerremotoService {

	 public List<Terremotos> retrieveTerremotos();
	 public Terremotos getTerremotos(Long terremotosId);
	 public void saveTerremoto(Terremotos terremotos);
	 public Terremotos getTerr(Long terremotosId); 
	
}
