$$$$


```bash
cd /home/segodimo/obsout | term
e /home/segodimo/obsout | term

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
cd /home/segodimo/14java/proyectos-java/ejercicio_00/ | term
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

# SOBRECARGA
### repetir metodos

```bash

public Cuenta(String nombre, int cuenta) {
    this.nombre = nombre;
    this.idcuenta = idcuenta;
}

public Cuenta(String nombre, int cuenta, double balance) {
    this.nombre = nombre;
    this.idcuenta = idcuenta;
    this.balance = balance;
}
```

# ENCAPSULAMIENT,
### no podemos acceder directamente a los atributos

getNombre setNombre

getIdcuenta setIdcuenta

#### getBalance #### setBalance

## Modificadores de acesso
- nada - mismo paquete
- public - todas las clases
- private - solo la clase que lo define
- protected - mismo paquete e subclases ('Herencia')

```bash
    public void setBalance(double balance){
        this.balance = balance;
    }
```

```bash
    public void addBalance(double deposito){
        balance = balance + deposito;
    }
    
    public void removeBalance(double retiro){
        balance = (balance - retiro) - 5;
    }
```

# HERENCIA

cuenta

cuentaAhorros
```bash
public class CuentaAhorros extends Cuenta {
    private double tasaInteres;

    public CuentaAhorros() {
        super();
    }  
    public CuentaAhorros(String nombre, int idcuenta, double balance, double tasaInteres) {
        super(nombre,idcuenta,balance);
        this.tasaInteres = tasaInteres;   
    }  

```

cuentaEmpresa
```bash
public class CuentaEmpresarial extends Cuenta {

    private double limite;
   
    public CuentaEmpresarial(String nombre, int idcuenta, double balance, double limite) {
        super(nombre,idcuenta,balance);
        this.limite = limite;   
    }  

```
# UPCASTING E DOWNCASTING

## UPCASTING
Cuenta para CuentaEmpresarial
Cuenta para CuentaAhorros

```bash
Account acc1 = bacc;
Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
```

## DOWNCASTING
CuentaEmpresarial para Cuenta
CuentaAhorros para Cuenta

```bash
BusinessAccount acc4 = (BusinessAccount)acc2;
acc4.loan(100.0);

BusinessAccount acc5 = (BusinessAccount)acc3;

if (acc3 instanceof BusinessAccount) {
    BusinessAccount acc5 = (BusinessAccount)acc3;
    acc5.loan(200.0);
    System.out.println("Loan!");
}
if (acc3 instanceof SavingsAccount) {
    SavingsAccount acc5 = (SavingsAccount)acc3;
    acc5.updateBalance();
    System.out.println("Update!");
}

```

# @Override - usar mismo método con regla diferente
(Sobreposição, palavra super, anotação @Override)

## Account:
```bash

public void withdraw(double amount) {
    balance -= amount + 5.0;
}
```

## SavingsAccount:
```bash

@Override
public void withdraw(double amount) {
    balance -= amount;
}
```

## Palavra super
```bash

@Override
public void withdraw(double amount) {
    super.withdraw(amount); // usar o método padrão de la clase superior
    balance -= 2.0;
}

```


# POLIMORFISMO

Em Programação Orientada a Objetos, polimorfismo é recurso que
permite que variáveis de um mesmo tipo mais genérico possam
apontar para objetos de tipos específicos diferentes, tendo assim
comportamentos diferentes conforme cada tipo específico.

Account x = new Account(1020, "Alex", 1000.0);
Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

x.withdraw(50.0);
y.withdraw(50.0);



---
# git
# ver version javac e java
javac -version
java -version


# .gitignore
ejercicio_00/bin/


**é possível mudar a descrição (mensagem) de um commit antigo**, mas **depende de duas coisas importantes**:

1. **quão antigo é o commit**
2. **se ele já foi enviado (push) para um repositório compartilhado**

Vou te explicar de forma direta.

---

## ✅ Commit mais recente (o último)

Se você só quer mudar a mensagem do **último commit**, é simples:

```bash
git commit --amend
```

* O editor abre com a mensagem atual
* Você altera, salva e pronto
* O hash do commit muda

⚠️ Se esse commit **já foi enviado (push)**:

```bash
git push --force
```

(use com cuidado)

---

## ✅ Commit antigo (não é o último)

Se o commit está alguns passos atrás, use **rebase interativo**.

1. Descubra quantos commits voltar (exemplo: 5):

```bash
git rebase -i HEAD~4
git rebase -i HEAD~5
```

2. Vai abrir uma lista tipo:

```
pick a1b2c3 Commit antigo
pick d4e5f6 Outro commit
```

3. Troque `pick` por `reword` (ou `r`) no commit que você quer mudar:

```
reword a1b2c3 Commit antigo
```

4. Salve → o editor abre → edite a mensagem → salve de novo

---

## ⚠️ Atenção importante (isso é sério)

* Isso **reescreve o histórico**
* **NUNCA faça isso em commits que outras pessoas já puxaram**, a menos que todo mundo saiba
* Se já foi enviado:

```bash
git push --force
```

ou, melhor:

```bash
git push --force-with-lease
```

---

## Regra prática (guarde isso)

* **Projeto só seu / branch local** → pode alterar
* **Branch compartilhada (main, develop)** → pense duas vezes

Se quiser, me diga:

* se o commit já foi enviado
* e se é um projeto só seu ou em equipe

Que eu te digo **a forma mais segura** de fazer 👍


Beleza — o **rebase aconteceu**, mas **você não mandou o Git trocar a mensagem**. O comportamento que você viu é exatamente o esperado nesse caso.

Vamos direto ao ponto 👇

---

## ❌ O que aconteceu

Quando você rodou:

```bash
git rebase -i HEAD~3
```

o editor abriu, **mas o commit continuou com `pick`**.
Resultado: o Git reaplicou os commits **sem pedir para editar a mensagem**.

Por isso a mensagem **não mudou**.

---

## ✅ O que você precisa fazer

Você tem que marcar explicitamente o commit para edição da mensagem.

### Passo a passo correto

1. Rode novamente:

```bash
git rebase -i HEAD~3
```

2. No editor que abrir, você verá algo assim:

```
pick 87408cb provate thid verDados
pick xxxx outro commit
pick yyyy outro commit
```

3. **Troque `pick` por `reword` (ou só `r`) no commit desejado**:

```
reword 87408cb provate thid verDados
pick xxxx outro commit
pick yyyy outro commit
```

4. Salve e feche o editor

5. O Git vai abrir outro editor → **aí sim você muda a mensagem**

   ```
   private this verDados
   ```

6. Salve e feche novamente

Pronto. Agora o commit estará com a descrição nova.

---

## 🔍 Como confirmar

Depois:

```bash
git log --oneline -3
```

Veja se a mensagem mudou.

---

## ⚠️ Se esse branch já foi enviado (push)

Você **vai precisar forçar**:

```bash
git push --force-with-lease
```

(use isso, não `--force` puro)

---

### Resumo rápido

* `pick` → não muda nada
* `reword` → muda a mensagem
* Seu rebase funcionou, só **faltou marcar o commit certo**

Se quiser, cola aqui o conteúdo que aparece no editor do `rebase -i` que eu te digo **exatamente o que alterar**.


Perfeito — **agora está do jeito certo** 👍
Você fez exatamente o que precisava: marcou o commit com `reword`.

Agora vamos ao **que falta** (provavelmente é aqui que você travou).

---

## O que deve acontecer a seguir

Depois de salvar esse arquivo e fechar o editor:

👉 **o Git abre automaticamente outro editor**
👉 Esse editor é **para você mudar a mensagem do commit `87408cb`**

Você vai ver algo assim:

```text
private this function verDados
```

Aí você:

1. Corrige a mensagem (exemplo):

   ```
   private verDados method
   ```
2. Salva
3. Fecha o editor

---

## Se o Git NÃO abriu o editor da mensagem

Então o rebase ficou **pausado esperando você continuar**.

Rode:

```bash
git rebase --continue
```

Isso vai:

* abrir o editor da mensagem (se ainda não abriu), **ou**
* finalizar o rebase se a mensagem já foi salva

---

## Como saber se deu certo

Depois que terminar:

```bash
git log --oneline -5
```

Confirme se a mensagem do commit mudou.

---

## Se der algum erro

* Conflito:

  ```bash
  git status
  ```

  Resolva → `git add .` → `git rebase --continue`

* Quer desistir:

  ```bash
  git rebase --abort
  ```

---

## Resumo curto

* ✔ `reword` está correto
* ✔ Agora **salva o arquivo**
* ✔ Edita a mensagem quando o editor abrir
* ✔ `git rebase --continue` se necessário

Se quiser, cola aqui **a tela que aparece depois de salvar** que eu te digo exatamente o próximo comando.
