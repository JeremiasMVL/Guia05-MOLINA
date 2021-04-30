package died.tp.guia05;

public class AgendaOcupadaException extends Exception {
	
	public AgendaOcupadaException() {
		super("El trabajador ya tiene otro trabajo agendado para este día.");
	}
	
}

/*Todas las clases de Exception presentan el siguiente Warning:
	"The serializable class *class* does not declare a static final serialVersionUID field of type long"
*/