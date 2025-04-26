
package aplication;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_02_1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        product.name = sc.nextLine();
        
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        //System.out.println(product.toString());
        System.out.println();
        System.out.println(product);
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity); //recuerde ctrl+click        
        
        System.out.println();
        System.out.println(product);     

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println(product);
        
        sc.close();
    }
}
