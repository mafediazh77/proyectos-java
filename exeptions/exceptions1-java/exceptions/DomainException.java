package model.exceptions;
// Paquete donde se guardan las excepciones personalizadas del proyecto

public class DomainException extends RuntimeException {
	// Clase que define una excepción personalizada del dominio (lógica del negocio)
	// Hereda de RuntimeException → no es necesario declararla con "throws"

	private static final long serialVersionUID = 1L;
	// Identificador único para la versión de la clase (recomendado para Serializable)

	public DomainException(String msg) {
		super(msg);
		// Llama al constructor de RuntimeException pasando el mensaje de error
	}
}
