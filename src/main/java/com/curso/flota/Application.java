package com.curso.flota;

import org.apache.log4j.Logger;

import com.curso.flota.dominio.Vehiculo;

public class Application

{
	
	static Logger log= Logger.getLogger(Application.class);
	
	public static void main( String[] args )
	{
		
		// Uso de uuna clase
		
		Vehiculo v =new Vehiculo(200.0,"b777");
		
		// v es una variable de referencia de vehiculo
		
		
		log.debug("OPsible error");
		int nota=8;
		System.out.printf("antea carga maxima  %f y nota %d %n", v.getCargaMaxima(), nota);
		
		name(v,nota);
		System.out.printf("carga maxima  %f y nota %d %n", v.getCargaMaxima(), nota);
		System.out.printf("Matricula  %s y carga maxima %f %n", v.getMatricula(), v.getCargaMaxima());
			
		
		
	}
	
	
	private static void name(Vehiculo h, int nota) {
		
		Vehiculo v2=h;
		
		v2.setCargaMaxima(555.0);
		
		Vehiculo v3= new Vehiculo(4000.3,"9oioioj");
		
	}
	
	
}