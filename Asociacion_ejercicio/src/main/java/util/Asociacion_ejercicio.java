

package util;

public class Asociacion_ejercicio {

    public static void main(String[] args) {
        
    
    Persona persona = new Persona("123456789", "Jose Pardo" );
 
    Libro libro = new Libro();

    libro.setIsbn("123-456-987");

    libro.setTitulo("Perdido en el Amazonas");

    persona.setLibro(libro);

    }

}

        
        
        
    
