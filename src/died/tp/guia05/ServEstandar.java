package died.tp.guia05;

public class ServEstandar extends Servicio {
	
	private Double costoFijo;
	//plusTrabajador resuelto como atributo de Trabajador

	
	public ServEstandar(String d, Oficio o, boolean u, double c) {
		super(d, o, u);
		this.costoFijo = c;
	}
	@Override
	public Double costoTotal(Trabajador t) {
		
		double costo = costoFijo + t.getPlusTrabajador();
		if(this.urgente)
			costo = costo*1.5; // +50% urgencia
		return costo;
	}

}
