
### 🧱 Estructura básica

Todo parte de la clase **`Throwable`**, que es la **clase madre de todos los errores y excepciones** en Java.
Tiene **dos subclases principales**:

1. **`Error`** → Problemas graves del sistema o de la JVM.
2. **`Exception`** → Problemas que el programa puede (y debe) manejar.

---

### ⚠️ 1. `Error`

Estos son **errores graves**, normalmente **fuera del control del programador**.
Aparecen cuando ocurre algo malo **en el entorno de ejecución** (la JVM, la memoria, etc.).

Ejemplos:

* **`OutOfMemoryError`** → la JVM se quedó sin memoria.
* **`StackOverflowError`** → el programa entró en una recursión infinita.

👉 **Importante:** los errores no se deben manejar con `try-catch`; normalmente el programa termina.

---

### ⚙️ 2. `Exception`

Estas son **situaciones anormales** que pueden ocurrir, pero que el programa **sí puede manejar**.
Por ejemplo: archivo no encontrado, error al acceder a una base de datos, etc.

---

#### 🧩 2.1. Checked Exceptions (Excepciones verificadas)

Son **verificadas en tiempo de compilación**.
El compilador te obliga a usar `try-catch` o declarar `throws`.

Ejemplos:

* **`IOException`** → error de entrada/salida (archivos, red, etc.)

  * **`FileNotFoundException`** → archivo no existe.
  * **`EOFException`** → fin de archivo inesperado.
* **`SQLException`** → error al acceder a una base de datos.

👉 Debes manejarlas, porque **el compilador lo exige**.

---

#### ⚡ 2.2. Runtime Exceptions (Excepciones no verificadas)

Son **errores de programación**, el compilador **no exige** manejarlas.
Ocurren durante la ejecución y pueden evitarse escribiendo buen código.

Ejemplos:

* **`NullPointerException`** → intentar usar algo que es `null`.
* **`IllegalArgumentException`** → pasar un argumento inválido a un método.
* **`ArrayIndexOutOfBoundsException`** → índice fuera de los límites del arreglo.

👉 Puedes manejarlas si quieres, pero lo ideal es **corregir el código** que las causa.

---

### 🪜 Resumen visual:

```
Throwable               ← todo empieza aquí
├── Error               ← errores graves (no manejables)
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
└── Exception           ← errores manejables
    ├── IOException     ← errores de E/S (archivos, red)
    │   ├── FileNotFoundException
    │   └── EOFException
    ├── SQLException    ← errores de base de datos
    └── RuntimeException← errores de lógica del código
        ├── NullPointerException
        ├── IllegalArgumentException
        ├── ArrayIndexOutOfBoundsException
        └── ...
```

---

### 💡 Tip para recordarlo:

| Tipo                  | Verificación        | Causa común                         | ¿Debe manejarse?                  |
| --------------------- | ------------------- | ----------------------------------- | --------------------------------- |
| **Error**             | No                  | Problemas de la JVM                 | ❌ No                              |
| **Checked Exception** | Sí (en compilación) | Errores externos (archivo, red, BD) | ✅ Sí                              |
| **Runtime Exception** | No                  | Errores lógicos del código          | ⚠️ Lo ideal es corregir el código |

---

Si quieres, puedo hacerte un **diagrama visual con colores** o una **versión corta en viñetas** para tus apuntes o diapositivas.
¿Quieres que lo haga?
