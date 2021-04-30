package died.tp.guia05;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {
	
	private String nombre;
	private String correo;
	private Oficio oficio;
	private Double costoPorHora;
	private Double plusTrabajador; //Se toma el plus como un "monto fijo" y no un calculo con porcentaje de comision
	private List<Trabajo> listaTrabajos;


	public Trabajador(String n, String c, Oficio o, Double cph, Double p) {
		this.nombre = n;
		this.correo = c;
		this.oficio = o;
		this.costoPorHora = cph;
		this.plusTrabajador = p;
		this.listaTrabajos = new ArrayList<Trabajo>();
	}
	
	public Double getPlusTrabajador() {
		return plusTrabajador;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getCostoPorHora() {
		return this.costoPorHora;
	}
	
	public List<Trabajo> getListaTrabajos() {
		return this.listaTrabajos;
	} // O resolverlo con un for (por cada trabajo) e imprimir cada nombre como string
	
	public void AgregarTarea(Trabajo t) throws OficioNoCoincideException, AgendaOcupadaException{
		
		if(this.oficio != t.oficio) // ¿Resolver con oficio.getNombre()?
			throw new OficioNoCoincideException();
		else if(this.fechaOcupada(t))
			throw new AgendaOcupadaException();
		
		this.listaTrabajos.add(t);
	}
	
	public boolean fechaOcupada(Trabajo t) {
		for(Trabajo i: this.listaTrabajos) {
			if(i.getFechaInicio().equals(t.getFechaInicio()))
				return true;
		}
		return false;
	}

}