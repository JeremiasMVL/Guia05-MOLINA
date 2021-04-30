package died.tp.guia05;

//import died.tp.guia05.Oficio;

public abstract class Servicio {

	protected String descripServicio;
	protected Oficio oficio;
	protected boolean urgente;
	
	
	public Servicio(String d, Oficio o, boolean u) {
		this.descripServicio = d;
		this.oficio = o;
		this.urgente = u;
	}
	
	public abstract Double costoTotal(Trabajador t); 
	
	public String getDescripcion() {
		return this.descripServicio;
	}
}
