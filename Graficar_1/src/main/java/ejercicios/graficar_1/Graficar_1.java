package ejercicios.graficar_1;


import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        super("Mi Ventana");
        frameInit();
    }

    public Ventana(String title) {
    super(title);
    frameInit();
    }

    @Override
    protected void frameInit() {
        super.frameInit();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300); // Tamaño de la ventana
        setVisible(true);  // Hacer visible la ventana
    }

    public static void main(String[] args) {
    new Ventana("Ventana de prueba");
    }
}