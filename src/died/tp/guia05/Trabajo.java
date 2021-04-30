package died.tp.guia05;

import java.time.Instant;

public class Trabajo implements Contratable {
	
	Trabajador trabajador;
	Servicio servicio;
	Oficio oficio;
	Instant fechaInicio;
	Instant fechaFinal;
	//Urgencia resuelta en Servicio

	public Trabajo(Trabajador t, Servicio s, Oficio o, Instant fi) {
		this.trabajador = t;
		this.servicio = s;
		this.oficio = o;
		this.fechaInicio = fi;
		this.fechaFinal = null;
	}

	public Instant getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechFinal(Instant ff) {
		this.fechaFinal = ff;
	}
	
	public boolean finalizado() {
		return (fechaFinal != null);
	}
	
	@Override
	public Double costo() {
		return this.servicio.costoTotal(trabajador);
	}
}
