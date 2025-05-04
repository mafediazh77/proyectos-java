
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
        sc.nextLine(); // limpiar el salto de línea pendiente

        System.out.println("Ingrese el nombre: ");
        String nam = sc.nextLine(); // ahora sí capturará correctamente
                
        System.out.println("desea hacer un deposito? s o n: ");
        String op = sc.nextLine();
        
        Cuenta cuenta;
        
        if (op.equals("s")){
            System.out.println("ingrese el valor del deposito: ");
            double val = sc.nextDouble();
            cuenta = new Cuenta(nam, id, val);
        }
        else {
            cuenta = new Cuenta(nam, id);                    
        }
        
        System.out.println();
        System.out.println("El nuevo estado de su cuenta es: "); 
        //Cuenta 8532, Nombre: Alex Green, Balance: $ 500.00
        System.out.println(
                "Cuenta "+cuenta.getIdcuenta()+ 
                ", Nombre: "+cuenta.getNombre()+
                ", Balance: " + cuenta.getBalance()
        );
        
        System.out.println();
        System.out.println("ingrese el valor del deposito: ");
        double deposito = sc.nextDouble();
        
        cuenta.addBalance(deposito);
        
        System.out.println();
        System.out.println("El nuevo estado de su cuenta es: "); 
        //Cuenta 8532, Nombre: Alex Green, Balance: $ 500.00
        System.out.println(
                "Cuenta "+cuenta.getIdcuenta()+ 
                ", Nombre: "+cuenta.getNombre()+
                ", Balance: " + cuenta.getBalance()
        ); 
        
        System.out.println();
        System.out.println("ingrese el valor del retiro: ");
        double retiro = sc.nextDouble();
        
        cuenta.removeBalance(retiro);
        
         System.out.println();
        System.out.println("El nuevo estado de su cuenta es: "); 
        //Cuenta 8532, Nombre: Alex Green, Balance: $ 500.00
        System.out.println(
                "Cuenta "+cuenta.getIdcuenta()+ 
                ", Nombre: "+cuenta.getNombre()+
                ", Balance: " + cuenta.getBalance()
        ); 
        
        
        sc.close();   
    }
   
}
