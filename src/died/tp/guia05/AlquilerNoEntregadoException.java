package died.tp.guia05;

public class AlquilerNoEntregadoException extends Exception{

	public AlquilerNoEntregadoException() {
		super("El usuario tiene m�s de dos alquileres sin haber sido devueltos");
	}
}
