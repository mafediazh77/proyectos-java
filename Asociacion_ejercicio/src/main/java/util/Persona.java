
package util;


public class Persona {

    private String cedula;// atributos de la clase
    private String nombre;
    private Libro libro;

    public Persona(String cedula, String nombre) {// constructor
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {// metodo get traer un dato obtener

        return cedula;

    }

    public void setCedula(String cedula) {//capturar

        this.cedula = cedula;

    }

    public String getNombre() {//obtener dato

        return nombre;

    }

    public void setNombre(String nombre) {//capturar nombre

        this.nombre = nombre;

    }



    public Libro getLibro() {

        return libro;

    }



    public void setLibro(Libro libro) {

        this.libro = libro;

    }

}

