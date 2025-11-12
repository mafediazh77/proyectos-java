package exceptions; // Define el paquete donde está la clase

// Clase que representa una excepción personalizada para errores de negocio
// (por ejemplo, límites de retiro, saldo insuficiente, etc.)
public class BusinessException extends RuntimeException {
	
	// Identificador de versión de la clase (usado en la serialización)
	private static final long serialVersionUID = 1L;

	// Constructor que recibe un mensaje y lo pasa a la superclase RuntimeException
	public BusinessException(String msg) {
		super(msg); // Llama al constructor de RuntimeException con el mensaje de error
	}
}
