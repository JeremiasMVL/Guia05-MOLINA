package died.tp.guia05;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String correo;
	private List<Contratable> listaContratados;

	public Usuario(String n, String c) {
		this.nombre = n;
		this.correo = c;
		this.listaContratados = new ArrayList<Contratable>();
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void contratar(Contratable c) throws AlquilerNoEntregadoException {
		
		int alqSinDevolver = 0;
		if(c instanceof Alquiler) { 
			for(Contratable i: listaContratados) {	
				if(i instanceof Alquiler && !i.finalizado())
					alqSinDevolver++;
			}
		}
		if(alqSinDevolver > 2)
			throw new AlquilerNoEntregadoException();
		else
			this.listaContratados.add(c);
		
	}
	
	public Double montoContratablesMes() {
		double costo = 0;
		for(Contratable i: this.listaContratados) 
			costo += i.costo();
		return costo;
	}

}
