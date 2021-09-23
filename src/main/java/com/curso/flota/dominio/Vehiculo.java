package com.curso.flota.dominio;

import java.io.Serializable;

public class Vehiculo implements Serializable{


	
	/**
	 * Clase de rol de entidad que modela los datos de un vehiculo
	 */
	private static final long serialVersionUID = 1L;	
	
	//atributos
	private double cargaMaxima;
	private String matricula;
	private double cargaActual;
	private int  numnCaja;


	//contructores
	public Vehiculo(double cargaMaxima,String matricula) {
		super();
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
		this.cargaActual=0;
		this.numnCaja=0;
	}
	
	
	//metodos
	

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCargaActual() {
		return cargaActual;
	}


	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}


	public int getNumnCaja() {
		return numnCaja;
	}


	public void setNumnCaja(int numnCaja) {
		this.numnCaja = numnCaja;
	}
	
	
	
	
	
	
}
