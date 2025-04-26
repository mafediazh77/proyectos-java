
package util;


public class Libro {// clase libro
    
    private String isbn;
    private String titulo; //atributos libro
    public Libro() {

    }

    public Libro(String isbn, String titulo) {// construtor

        this.isbn = isbn;
        this.titulo = titulo;

    }

    public String getIsbn() { //obtener, traer el valor y escribirlo

        return isbn;

    }

    public void setIsbn(String isbn) {// asignar

        this.isbn = isbn;

    }


    public String getTitulo() {

        return titulo;

    }


    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    
}
