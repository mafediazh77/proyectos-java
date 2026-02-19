$$$$


```bash
cd /home/segodimo/14java/proyectos-java/ejercicio_00/
```

#  OPTION 1 (COMPILE e RUN)
```bash
# COMPILE
javac -d bin app/Ejercicio_00.java       

# RUN
java -cp bin app/Ejercicio_00.java       
```

#  OPTION 2 (COMPILE e RUN)
```bash
# COMPILE
javac -d bin app/**/*.java

# RUN
java -cp bin app/**/*.java
```

# git
```bash
cd /home/segodimo/14java/proyectos-java/
git status
git add .
git status
git commit -m "ejercicio_00 start"
git status
git log

git pull
git push
git config pull.rebase false

git checkout nome-da-branch
git pull origin nome-da-branch
git fetch --all

# mudar de comentario no commit
git commit --amend
```

# tree
```bash
cd /home/segodimo/14java/proyectos-java/ejercicio_00/
tree /home/segodimo/14java/proyectos-java/ejercicio_00/

├── app
│   └── Ejercicio_00.java
├── clase00.md
└── entities
    └── Cuenta.java

```

---
### ejercicio_00/app/Ejercicio_00.java
├── app
│   └── Ejercicio_00.java

```bash
package app;

import entities.Cuenta;

public class Ejercicio_00 {
    public static void main(String[] args) {
      Cuenta nomvariable = new Cuenta("Lucas", 4040); 
      System.out.println(nomvariable.nombre);
      System.out.println(nomvariable.idcuenta);
    }
}
```
---
### ejercicio_00/entities/Cuenta.java
└── entities
    └── Cuenta.java


```bash
package entities;

public class Cuenta {
    public String nombre;
    public int idcuenta;

    public Cuenta(String varnombre, int varidcuenta) {
        nombre = varnombre;
        idcuenta = varidcuenta;
    }
}
```





---
# JAVA
---

## java IMPRIMIR /app/Ejercicio_00.java
```bash
System.out.println();

```

## java CONSTRUCTOR /entities/Cuenta.java
```bash
    public Cuenta(String varnombre, int varidcuenta) {
        nombre = varnombre;
        idcuenta = varidcuenta;
    }
```

## java CONSTRUCTOR this /entities/Cuenta.java
```bash
    public Cuenta(String nombre, int cuenta) {
        this.nombre = nombre;
        this.idcuenta = idcuenta;
    }
```

## instancia de objeto /app/Ejercicio_00.java
```bash
Cuenta nomvariable = new Cuenta("Lucas", 4040); 
```
- obj tipo             Cuenta
- nom_var              nomvariable // nomvariable carga classe=todo el objeto
- nova instancia       new
- constructor          Cuenta("Lucas", 4040); parametros = "Lucas", 4040



## java IMPRIMIR COM UM METODO/FUNCION /entities/Cuenta.java
```bash
public void verDados(){
    System.out.println("nombre " + nombre + " idcuenta " + idcuenta);
}
```

---
# git
# ver version javac e java
javac -version
java -version


# .gitignore
ejercicio_00/bin/


