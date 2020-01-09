package com.pjmineduc.pjmineduc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjmineduc.pjmineduc.entity.*;

@Repository
public interface TerremotoRepository extends JpaRepository<Terremotos,Long>{
 
}