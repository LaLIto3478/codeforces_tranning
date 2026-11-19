# # 🏆 Codeforces & Competitive Programming - Guía y Soluciones (Code Fest)

Repositorio de preparación para el **Concurso de Programación Competitiva - Primera Edición (Code Fest)**. Contiene soluciones comentadas en **Java** a problemas de **Codeforces**, enfocadas en lógica algorítmica, optimización de complejidad y buenas prácticas para jueces en línea.

---

## 📋 Reglas y Formato del Concurso
* **Formato:** 5 problemas en 3 horas.
* **Entorno:** Estilo programación competitiva, **sin IA, sin IDEs, únicamente terminal**.
* **Lenguajes permitidos:** Java, Python y C/C++.
* **Plataforma:** Codeforces.

---

## 📂 Problemas Resueltos

| Problema | Archivo | Técnica Principal | Complejidad Temporal | Complejidad Espacial |
| :--- | :--- | :--- | :---: | :---: |
| **Good Contest** (Minimizar participantes débiles) | `GoodContest.java` | Greedy / Teoría de Conjuntos (`min`) | $O(1)$ por caso | $O(1)$ |
| **Choosing Teams** (Formación de equipos ICPC) | `ChoosingTeams.java` | Procesamiento al vuelo (*Streaming*) / Greedy | $O(n)$ | $O(1)$ |

---

## ⚡ Reglas de Oro para Codeforces (Java)

1. **Nombre de la clase:** Al enviar tu código a Codeforces, asegúrate de que la clase principal se llame `Main` (`public class Main`) o elimina el modificador `public` de la clase. De lo contrario, obtendrás un *Compilation Error*.
2. **Salida limpia:** Nunca imprimas mensajes como `"Ingresa un número:"`. El juez compara la salida estándar carácter por carácter; cualquier texto extra dará *Wrong Answer (WA)*.
3. **No guardes lo que no necesitas:** Si el problema no requiere ordenar datos ni volver a consultarlos (como en `ChoosingTeams`), procésalos conforme los lees con `Scanner` para mantener la memoria en $O(1)$.
4. **Entrada rápida:** `Scanner` funciona bien para entradas pequeñas ($\le 10^4$ datos).
---

## 💻 Flujo de Trabajo en Terminal (Sin IDE)

Dado que el concurso se desarrolla únicamente en terminal, utiliza estos comandos para compilar y probar tus soluciones rápidamente:

### 1. Compilar y ejecutar manualmente
```bash
javac Main.java
java Main
