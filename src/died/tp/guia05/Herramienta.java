package died.tp.guia05;

public class Herramienta {
		
	private String nombre;
	private Double costoPorDia;
	

	public Herramienta(String n, Double c){
		this.nombre = n;
		this.costoPorDia = c;
	}
	
	public Double getCostoPorDia() {
		return costoPorDia;
	}
	
	public String getNombre() {
		return nombre;
	}

}