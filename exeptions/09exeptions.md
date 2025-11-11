# Tratamiento de Excepciones en Java

## 📋 Introducción

**Universidad Distrital Francisco José de Caldas**  
**Facultad de Ingeniería - Ingeniería de Sistemas - Programación Orientada a Objetos**  
*N. Alves, M. Díaz*

## 🚫 ¿Qué son las Excepciones?

Una **excepción** es cualquier condición de error o comportamiento inesperado que encuentra un programa en ejecución.

En Java, una excepción es un objeto heredado de:

- **`java.lang.Exception`**: El compilador obliga a manejarla (try-catch) o propagarla (throws)
- **`java.lang.RuntimeException`**: El compilador no obliga a manejarla

Al ser lanzada, una excepción se propaga en la **pila de llamadas** de métodos en ejecución. Si no es capturada, el programa será terminado.

## 📊 Jerarquía de Excepciones de Java

```
Throwable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
└── Exception
    ├── IOException
    │   ├── FileNotFoundException
    │   └── EOFException
    ├── SQLException
    └── RuntimeException
        ├── NullPointerException
        ├── IllegalArgumentException
        ├── ArrayIndexOutOfBoundsException
        └── ...
```

*Enlace de referencia: [Java API Documentation](https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html)*

## ❓ ¿Por qué usar Excepciones?

El modelo de tratamiento de excepciones permite manejar errores de manera **consistente** y **flexible**.

### ✅ Ventajas

- **Delega la lógica de error** a la clase responsable
- **Trata excepciones de forma organizada** (jerárquica)
- **Permite almacenar información** adicional en la excepción

## 🏗️ Estructura Try-Catch

### 1. Bloque Try
Contiene el código que representa la ejecución normal y puede lanzar excepciones.

### 2. Bloque Catch
Contiene el código que se ejecutará si ocurre una excepción.

### 3. Ejemplo Práctico

```java
try {
    // Código que puede lanzar excepciones
    FileReader file = new FileReader("archivo.txt");
    // ... más código
} catch (FileNotFoundException e) {
    // Manejo de la excepción específica
    System.out.println("Archivo no encontrado: " + e.getMessage());
} catch (IOException e) {
    // Manejo de excepciones más generales
    System.out.println("Error de E/S: " + e.getMessage());
}
```

## 📝 Sintaxis Completa

```java
try {
    // Código que puede generar excepciones
    riskyMethod();
} catch (SpecificException e) {
    // Manejo de excepción específica
    logger.error("Error específico", e);
} catch (GeneralException e) {
    // Manejo de excepción general
    logger.error("Error general", e);
} finally {
    // Código que siempre se ejecuta
    cleanupResources();
}
```

## 🔄 Pila de Llamadas a Métodos

Cuando ocurre una excepción, Java busca en la pila de llamadas:

```
métodoA() → métodoB() → métodoC() → EXCEPCIÓN
```

La excepción se propaga hacia arriba hasta encontrar un bloque `catch` que la maneje.


```java
import java.util.InputMismatchException; // Importa excepción para errores de tipo de dato
import java.util.Scanner;                // Importa la clase Scanner para leer datos

public class Program {                   // Declaración de la clase principal

    public static void main(String[] args) {  // Método principal del programa

        method1();                       // Llamada al método 1

        System.out.println("End of program"); // Mensaje final del programa
    }

    public static void method1() {       // Declaración del método 1
        System.out.println("*** METHOD 1 START ***"); // Inicio del método 1
        method2();                       // Llamada al método 2
        System.out.println("*** METHOD 1 END ***");   // Fin del método 1
    }

    public static void method2() {       // Declaración del método 2
        System.out.println("*** METHOD 2 START ***"); // Inicio del método 2
        Scanner sc = new Scanner(System.in);         // Crea un lector para entrada de usuario

        try {
            String[] vect = sc.nextLine().split(" ");  // Lee una línea y la separa por espacios
            int position = sc.nextInt();               // Lee un número entero
            System.out.println(vect[position]);        // Imprime el elemento del vector en esa posición
        }
        catch (ArrayIndexOutOfBoundsException e) {     // Excepción si la posición no existe
            System.out.println("Invalid position!");   // Mensaje de error
            e.printStackTrace();                       // Imprime la traza del error
            sc.next();                                 // Limpia el buffer del scanner
        }
        catch (InputMismatchException e) {             // Excepción si el usuario no ingresa un número
            System.out.println("Input error!");        // Mensaje de error
        }

        sc.close();                                    // Cierra el Scanner
        System.out.println("*** METHOD 2 END ***");    // Fin del método 2
    }
}
```


## 🗃️ Bloque Finally

- **Bloque opcional** que siempre se ejecuta
- **Independientemente** de si ocurrió o no una excepción
- **Uso común**: liberar recursos (archivos, conexiones, etc.)

### Sintaxis

```java
FileInputStream file = null;

try {
    // Intenta abrir el archivo "archivo.txt"
    file = new FileInputStream("archivo.txt");

    // Aquí iría el código que procesa el archivo
    // (leer bytes, convertir texto, etc.)

} catch (IOException e) {
    // Se ejecuta si ocurre algún error al abrir o procesar el archivo
    System.out.println("Error: " + e.getMessage());

} finally {
    // Este bloque SIEMPRE se ejecuta, ocurra o no un error
    if (file != null) {  // Verifica que el archivo realmente se abrió
        try {
            file.close(); // Cierra el archivo correctamente
        } catch (IOException e) {
            // Se ejecuta si ocurre un error al intentar cerrar el archivo
            System.out.println("Error cerrando archivo");
        }
    }
}
```

## 🛠️ Creando Excepciones Personalizadas

### Estructura Recomendada de Paquetes

```
src/
└── main/
    └── java/
        └── com/
            └── proyecto/
                ├── model/
                │   ├── entities/
                │   └── exceptions/
                └── application/
```

### Ejemplo de Excepción Personalizada

```java
package com.proyecto.model.exceptions;

public class ReservationException extends Exception {
    public ReservationException(String message) {
        super(message);
    }
    
    public ReservationException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

## 💡 Problema de Ejemplo: Sistema de Reservas

**Objetivo**: Crear un programa para gestionar reservas de hotel con validaciones.

### Reglas de Negocio:
- Los cambios de reserva solo se pueden realizar para fechas futuras
- La fecha de salida debe ser posterior a la fecha de entrada

### Ejemplo de Implementación

```java
public class HotelReservation {
    private int roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    
    public void updateDates(LocalDate newCheckIn, LocalDate newCheckOut) 
        throws ReservationException {
        
        if (newCheckIn.isBefore(LocalDate.now())) {
            throw new ReservationException("La fecha de entrada debe ser futura");
        }
        
        if (!newCheckOut.isAfter(newCheckIn)) {
            throw new ReservationException("La fecha de salida debe ser posterior a la entrada");
        }
        
        this.checkIn = newCheckIn;
        this.checkOut = newCheckOut;
    }
}
```

## 📊 Resumen de Soluciones

### ❌ Solución 1 (Muy Mala)
**Validación en programa principal**
- Lógica de validación no delegada
- Código duplicado y difícil de mantener

### ❌ Solución 2 (Mala)
**Método que devuelve String**
- Semántica de operación perjudicada
- No permite manejo en constructores
- Programador debe verificar manualmente errores

### ✅ Solución 3 (Buena)
**Tratamiento con Excepciones**
- [Código de ejemplo en GitHub](https://github.com/mafediazh77/proyectos-java/tree/main/exeptions/exceptions1-java)

## 🎯 Resumen de la Clase

### Conceptos Clave
- **Cláusula `throws`**: Propaga la excepción al método llamador
- **Cláusula `throw`**: Lanza una excepción manualmente
- **Exception vs RuntimeException**: Comprobadas vs No comprobadas

### ✅ Ventajas del Modelo
- **Lógica delegada** apropiadamente
- **Constructores pueden manejar** excepciones
- **Ayuda del compilador** para excepciones comprobadas
- **Código más simple** sin múltiples condiciones
- **Captura de excepciones del sistema**

## 💰 Ejercicio de Fijación: Sistema Bancario

**Objetivo**: Crear un programa para gestionar cuentas bancarias con retiros controlados.

### Reglas:
- No se puede realizar retiro si no hay saldo suficiente
- El valor del retiro no puede superar el límite de la cuenta

### Diagrama de Clases
```
Account
├── number: Integer
├── holder: String
├── balance: Double
├── withdrawLimit: Double
├── deposit(amount: Double)
└── withdraw(amount: Double)
```

### Ejemplos de Uso

```java
public class Account {
    private String holder;
    private double balance;
    private double withdrawLimit;
    
    public void withdraw(double amount) throws BusinessException {
        if (amount > withdrawLimit) {
            throw new BusinessException("El valor excede el límite de retiro");
        }
        if (amount > balance) {
            throw new BusinessException("Saldo insuficiente");
        }
        balance -= amount;
    }
}
```

### Ejecuciones de Ejemplo

**Caso 1: Retiro exitoso**
```
Entrada:
Número de cuenta: 8021
Titular: Bob Brown
Saldo inicial: 500.00
Límite de retiro: 300.00
Monto a retirar: 200.00

Salida:
Nuevo saldo: 300.00
```

**Caso 2: Error - Saldo insuficiente**
```
Error en el retiro: Saldo insuficiente
```

**Caso 3: Error - Límite excedido**
```
Error en el retiro: El valor excede el límite de retiro
```

*Código completo disponible en: [GitHub - exceptions2-java](https://github.com/mafediazh77/proyectos-java/tree/main/exeptions/exceptions2-java)*

---

*Documento revisado y mejorado - Listo para uso en clase* 🎓
