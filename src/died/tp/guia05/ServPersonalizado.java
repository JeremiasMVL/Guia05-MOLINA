package died.tp.guia05;

public class ServPersonalizado extends Servicio{
	
	private Double valorPresupuestado;
	private Double materiales;
	private Double transporte;

	public ServPersonalizado(String d, Oficio o, boolean u, Double v, Double m, Double t) {
		super(d, o, u);
		this.valorPresupuestado = v;
		this.materiales = m;
		this.transporte = t;
	}
	@Override
	public Double costoTotal(Trabajador t) {
		
		double costo = this.valorPresupuestado + this.materiales + this.transporte;
		if(this.urgente)
			costo = costo*1.5; // +50% urgencia
		return costo;
	}




}
