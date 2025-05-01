
package aplication;

import entities.Cuenta;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Ingrese el número de la cuenta: "); 
        int id = sc.nextInt();

        System.out.println("Ingrese el nombre: ");
        String nam = sc.nextLine();
                
        System.out.println("desea hacer un deposito? s o n: ");
        String op = sc.nextLine();
        
        if (op == "s"){
            System.out.println("ingrese el valor del deposito: ");
            double val = sc.nextDouble();
            Cuenta cuenta = new Cuenta(nam, id, val);
        }
        else {
            Cuenta cuenta = new Cuenta(nam, id);                    
        }
        
        sc.close();   
    }
   
}
