package app;

import entities.Cuenta;

public class Ejercicio_00 {
    public static void main(String[] args) {

      Cuenta persona1 = new Cuenta("Lucas", 4040); 
      System.out.println(persona1.verDados());

      System.out.println();

      Cuenta persona2 = new Cuenta("Mario", 1110, 50000); 
      System.out.println(persona2.verDados());

      System.out.println();

      persona1.addBalance(100000);
      System.out.println("Lucas "+persona1.getBalance());

      persona2.removeBalance(20000);
      System.out.println("Mario "+persona2.getBalance());


    }
}
