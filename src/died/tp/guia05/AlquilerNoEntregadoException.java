package died.tp.guia05;

public class AlquilerNoEntregadoException extends Exception{

	public AlquilerNoEntregadoException() {
		super("El usuario tiene más de dos alquileres sin haber sido devueltos");
	}
}
