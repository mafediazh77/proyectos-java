package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock() {
        return price * quantity;
    }
    
    // this es una palabra clave que se refiere al 
    // objeto que llama a una función
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    //toString() es un método que permite representar un objeto como una cadena de texto
    public String toString(){
        //return String.format("%.2f", totalValueInStock());
        return name
        + ", $ "
        + String.format("%.2f", price)//%.2f es un especificador que se deben mostrar dos decimales de un número en coma flotante
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());        
    }
}
