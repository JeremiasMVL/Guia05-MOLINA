package died.tp.guia05;

import java.time.Instant;
import java.time.Duration;

public class Alquiler implements Contratable {
	
	private Herramienta herramienta;
	private Instant fechaInicio;
	private Instant fechaFinal;
	private Instant fechaDevolucion;

	
	public Alquiler(Herramienta h, Instant fi, Instant ff, Instant fd) { 
		this.herramienta = h;
		this.fechaInicio = fi;
		this.fechaFinal = ff;
		this.fechaDevolucion = null;
	}
	
	public boolean enMora() {
		return ((this.fechaDevolucion != null && this.fechaFinal.isBefore(this.fechaDevolucion)) || 
				(this.fechaDevolucion == null && this.fechaFinal.isBefore(Instant.now()))
				); 
	}
	
	@Override
	public Double costo() {
		
		long diasAlq = 0;
		if(this.fechaDevolucion == null)
			diasAlq = Duration.between(this.fechaInicio, Instant.now()).toDays(); //¿utilizar toDaysPart()?
		else
			diasAlq = Duration.between(this.fechaInicio, this.fechaDevolucion).toDays();
		double costo = herramienta.getCostoPorDia()*diasAlq;
		return costo;
	}
	
	public void devolverHerramienta() {
		
		fechaDevolucion = Instant.now();
	}
	
	public boolean finalizado() {
		
		return (fechaDevolucion != null);
	}

}

