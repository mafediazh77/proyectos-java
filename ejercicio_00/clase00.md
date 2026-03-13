$$$$


```bash
cd /home/segodimo/obsout | term
e /home/segodimo/obsout | term

cd /home/segodimo/14java/proyectos-java/ejercicio_00/
cd /home/segodimo/14java/proyectos-java/ejercicio_00/ | term
e /home/segodimo/15java/proyectos-java/ejercicio_00/ | term
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

---
```bash
cd /home/segodimo/50clf/
python print_allfiles_path.py /home/segodimo/14java/proyectos-java/ejercicio_00/
e out_print_allfiles.md

me ajuda a explicar UPCASTING e DOWNCASTING:

por favor revice todo meu código no arquivo out_print_allfiles.md,
usando como base o arquivo out_print_allfiles.md,
eu quero explicar UPCASTING e DOWNCASTING,
eu estaba explicando como usar eles baseado en ejemplo:

// UPCASTING - subclases atribuidas a superclases

// Cuenta cuenta1 = ce;

Cuenta cuenta2 = new CuentaEmpresarial("Pedro", 6060, 300, 2000);

Cuenta cuenta3 = new CuentaAhorros("Juan", 7707, 300, 0.01);


// DOWNCASTING

// CuentaEmpresarial cuenta4 = cuenta2 <<PROBLEMA !!!>>
// No puedo hacer que un tipo Cuenta sea un CuentaEmpresarial
// No voy a poder usar la funcion prestamo - cuenta2.prestamo(100)
// pq nos es un CuentaEmpresarial

CuentaEmpresarial cuenta4 = (CuentaEmpresarial) cuenta2;
cuenta4.prestamo(100);

// CuentaEmpresarial cuenta5 = (CuentaAhorros) cuenta3; //ERROR
//
// Como Validar

if(cuenta3 instanceof CuentaEmpresarial){
  System.out.println("Es CuentaEmpresarial");
  CuentaEmpresarial cuenta5 = (CuentaEmpresarial) cuenta3; //ERROR
  CuentaAhorros cuentaAhorros = (CuentaAhorros) cuenta;
  // cuentaAhorros.prestamo(100);
}
```


Beleza — vou fazer **três coisas bem objetivas**, usando **exatamente o seu código** como base (ele está bom, só a explicação precisava ajuste):

1. **Revisar sua explicação de UPCASTING**
2. **Revisar sua explicação de DOWNCASTING**
3. **Corrigir comentários e conceitos confusos**, sem mudar a ideia original

Vou explicar **como professor**, mas no seu estilo 👍

---

# 1️⃣ UPCASTING (no seu código)

### Conceito correto

**Upcasting** é quando um objeto de uma **subclasse** é tratado como uma **superclasse**.

📌 Isso é:

* **automático**
* **seguro**
* **não precisa cast**

---

### No seu projeto

Você tem:

```java
Cuenta           // superclasse
CuentaAhorros    // subclasse
CuentaEmpresarial // subclasse
```

Então isso é **UPCASTING** 👇

```java
Cuenta cuenta2 = new CuentaEmpresarial("Pedro", 6060, 300, 2000);
Cuenta cuenta3 = new CuentaAhorros("Juan", 7707, 300);
```

💡 O que está acontecendo aqui?

* O **objeto real** é `CuentaEmpresarial`
* A **referência** é `Cuenta`

Ou seja:

> “Estou tratando uma CuentaEmpresarial como se fosse uma Cuenta”

✔ Isso é permitido porque **toda CuentaEmpresarial É uma Cuenta**

---

### Consequência importante (você quase explicou certo)

```java
cuenta2.prestamo(100); // ❌ NÃO COMPILA
```

❌ **Por quê?**

Porque:

* O **tipo da variável** é `Cuenta`
* `Cuenta` **não tem** o método `prestamo()`

👉 Mesmo que o objeto REAL seja empresarial,
👉 o compilador olha **apenas o tipo da referência**

---

### Comentário corrigido (melhor versão)

```java
// UPCASTING
// Objeto de subclasse sendo atribuído a uma referência de superclasse
Cuenta cuenta2 = new CuentaEmpresarial("Pedro", 6060, 300, 2000);
Cuenta cuenta3 = new CuentaAhorros("Juan", 7707, 300);
```

---

# 2️⃣ DOWNCASTING (aqui estava a maior confusão)

### Conceito correto

**Downcasting** é quando você força uma referência da **superclasse**
a virar uma **subclasse específica**.

📌 Downcasting:

* **NÃO é automático**
* **precisa cast**
* **pode gerar erro em tempo de execução**

---

### Seu exemplo (correto)

```java
CuentaEmpresarial cuenta4 = (CuentaEmpresarial) cuenta2;
cuenta4.prestamo(100);
```

✔ Isso funciona porque:

* `cuenta2` **aponta para um objeto CuentaEmpresarial**
* Então o cast é válido

💡 Tradução simples:

> “Eu sei que essa Cuenta, na verdade, é Empresarial”

---

### O comentário que precisa correção

Você escreveu:

```java
// No puedo hacer que un tipo Cuenta sea un CuentaEmpresarial
```

❌ Isso está **conceitualmente errado**

✅ O correto é:

> **Não posso converter QUALQUER Cuenta em CuentaEmpresarial**
> **Só posso se o objeto REAL for CuentaEmpresarial**

---

### Exemplo de erro real (muito bem que você tentou)

```java
CuentaEmpresarial cuenta5 = (CuentaEmpresarial) cuenta3; // ERROR
```

❌ Por quê?

Porque:

* `cuenta3` aponta para um **objeto CuentaAhorros**
* Ele **NÃO é** CuentaEmpresarial

👉 Isso compila
👉 Mas **explode em tempo de execução (ClassCastException)**

---

# 3️⃣ instanceof (sua validação)

Essa parte está **no caminho certo**, só precisa ajuste fino.

### Seu código:

```java
if (cuenta3 instanceof CuentaEmpresarial) {
    System.out.println("Es CuentaEmpresarial");
    CuentaEmpresarial cuenta5 = (CuentaEmpresarial) cuenta3;
}
```

✔ A ideia está correta
❌ Mas **esse if nunca será verdadeiro**, porque `cuenta3` é `CuentaAhorros`

---

### Forma correta e completa

```java
if (cuenta3 instanceof CuentaEmpresarial) {
    CuentaEmpresarial ce = (CuentaEmpresarial) cuenta3;
    ce.prestamo(100);
} else if (cuenta3 instanceof CuentaAhorros) {
    CuentaAhorros ca = (CuentaAhorros) cuenta3;
    ca.removeBalance(50);
}
```

💡 Regra de ouro:

> **Sempre use instanceof antes de fazer downcasting**

---

# 4️⃣ Resumo curto (para colocar no seu markdown)

### UPCASTING

* Subclasse → Superclasse
* Automático
* Seguro
* Perde acesso a métodos específicos da subclasse

```java
Cuenta c = new CuentaEmpresarial(...);
```

---

### DOWNCASTING

* Superclasse → Subclasse
* Precisa cast
* Pode gerar erro
* Use `instanceof`

```java
if (c instanceof CuentaEmpresarial) {
    CuentaEmpresarial ce = (CuentaEmpresarial) c;
}
```

---

## ✅ Avaliação final (sem sugarcoat)

* Seu **código está bom**
* Seu **entendimento está 80% correto**
* O erro era **linguagem conceitual**, não Java

Se quiser, no próximo passo eu:

* reescrevo **só a seção UPCASTING/DOWNCASTING do seu `.md`**, pronta pra estudar
* ou te explico **polimorfismo ligado a casting**, que é o próximo nível 👌

# POLIMORFISMO
Perfeito 👍
vou explicar **POLIMORFISMO usando exatamente o SEU código e o SEU exemplo**, sem inventar nada novo.

Vou ser bem direto e didático.

---

# 🔁 POLIMORFISMO (com o seu exemplo)

## 1️⃣ O que é polimorfismo (em uma frase)

> **Polimorfismo é quando uma variável do tipo da superclasse (`Cuenta`) aponta para objetos de subclasses diferentes, e cada objeto se comporta do seu próprio jeito.**

---

## 2️⃣ Onde o polimorfismo aparece no SEU código

Essas três classes:

```java
Cuenta            // superclasse
CuentaAhorros     // subclasse
CuentaEmpresarial // subclasse
```

E esse método na superclasse:

```java
public void removeBalance(double retiro){
    balance = (balance - retiro) - 5;
}
```

E o método sobrescrito na subclasse `CuentaAhorros`:

```java
@Override
public void removeBalance(double retiro){
    balance = (balance - retiro);
}
```

👉 **Aqui nasce o polimorfismo**.

---

## 3️⃣ Exemplo clássico usando o SEU código (UPCASTING + POLIMORFISMO)

Vamos imaginar isso no `main`:

```java
Cuenta c1 = new Cuenta("Lucas", 4040, 1000);
Cuenta c2 = new CuentaAhorros("Pablo", 5577, 1000);
```

⚠️ Repare:

* `c1` é uma `Cuenta`
* `c2` **também é do tipo Cuenta**
* mas **os objetos reais são diferentes**

👉 Isso já é **UPCASTING**
👉 Agora vem o **POLIMORFISMO**

---

## 4️⃣ Chamando o MESMO método

```java
c1.removeBalance(100);
c2.removeBalance(100);
```

Mesma chamada
Mesmo método
Mesmo código no `main`

❗ **Mas o resultado é diferente**

---

### O que acontece por baixo dos panos

#### Para `c1` (Cuenta normal):

```java
balance = balance - 100 - 5;
```

➡ taxa de 5 aplicada

---

#### Para `c2` (CuentaAhorros):

```java
balance = balance - 100;
```

➡ **sem taxa**

---

💡 Tradução simples:

> O Java decide **em tempo de execução** qual método usar,
> baseado no **tipo real do objeto**,
> não no tipo da variável.

✔ Isso é **POLIMORFISMO**

---

## 5️⃣ Frase chave (guarde essa)

> **A variável é do tipo `Cuenta`,
> mas o comportamento depende do objeto real (`Cuenta` ou `CuentaAhorros`).**

---

## 6️⃣ Ligando com o seu código real

No seu `Ejercicio_00.java` você já faz isso aqui:

```java
CuentaAhorros persona3 = new CuentaAhorros("Pablo", 5577, 100000);
persona3.removeBalance(60000);
```

Agora imagine assim (forma polimórfica):

```java
Cuenta persona3 = new CuentaAhorros("Pablo", 5577, 100000);
persona3.removeBalance(60000);
```

✔ Compila
✔ Funciona
✔ Chama o método da subclasse

👉 **Isso é polimorfismo em ação**

---

## 7️⃣ O que NÃO é polimorfismo (confusão comum)

❌ Isso **não é** polimorfismo:

```java
CuentaEmpresarial ce = new CuentaEmpresarial(...);
ce.prestamo(100);
```

Isso é:

* herança
* chamada direta
* **sem polimorfismo**

👉 Polimorfismo **exige**:

* superclasse
* referência genérica
* métodos sobrescritos (`@Override`)

---

## 8️⃣ Resumo curto (para seu markdown)

### POLIMORFISMO

* Variável do tipo da superclasse
* Objeto de subclasses diferentes
* Mesmo método → comportamentos diferentes
* Decisão feita **em tempo de execução**

```java
Cuenta c1 = new Cuenta("Lucas", 4040, 1000);
Cuenta c2 = new CuentaAhorros("Pablo", 5577, 1000);

c1.removeBalance(100); // aplica taxa
c2.removeBalance(100); // não aplica taxa
```

---

## ✅ Avaliação honesta

Você:

* já entende **herança**
* já entende **upcasting**
* só faltava ligar isso ao **@Override**

👉 **Polimorfismo = upcasting + override + chamada dinâmica**

Se quiser, no próximo passo eu:

* reescrevo **a seção POLIMORFISMO do seu `.md` pronta**
* ou conecto **polimorfismo × downcasting (quando usar e quando evitar)**
