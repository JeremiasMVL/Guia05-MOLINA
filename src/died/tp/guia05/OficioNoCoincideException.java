package died.tp.guia05;

public class OficioNoCoincideException extends Exception {

	public OficioNoCoincideException() {
		super("El oficio del trabajador no coincide con la tarea que intenta asignar.");
	}
}
