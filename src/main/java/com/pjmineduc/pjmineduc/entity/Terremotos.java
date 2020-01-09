package com.pjmineduc.pjmineduc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Terremotos")
public class Terremotos {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="FECHA_INICIAL")
	public String fechaInicial;
	
	@Column(name="FECHA_FINAL")
	public String fechaFinal;
	
	@Column(name="MAG_INICIAL")
	public double magnitudInicial;
	
	@Column(name="MAG_FINAL")
	public double magnitudFinal;

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public double getMagnitudInicial() {
		return magnitudInicial;
	}

	public void setMagnitudInicial(double magnitudInicial) {
		this.magnitudInicial = magnitudInicial;
	}

	public double getMagnitudFinal() {
		return magnitudFinal;
	}

	public void setMagnitudFinal(double magnitudFinal) {
		this.magnitudFinal = magnitudFinal;
	}
}
