import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // La clase Scanner se utiliza para entradas por consola. NO usar JOptionPane.
        Scanner in = new Scanner(System.in);

        // 1. Lectura del número de casos de prueba (t en el enunciado).
        // En programación competitiva casi todos los problemas ejecutan múltiples casos en una sola corrida.
        int t = in.nextInt();

        // 2. Bucle principal que procesa cada caso de prueba de forma independiente.
        for (int i = 0; i < t; i++) {
            
            // Número total de participantes en este caso (n en el enunciado).
            int participantes = in.nextInt();

            // Cantidad de personas que resolvieron el problema 1 (a), problema 2 (b) y problema 3 (c).
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            // 3. LÓGICA DEL PROBLEMA (Enfoque Greedy / Teoría de Conjuntos):
            // Queremos MINIMIZAR los participantes "débiles" (los que NO resolvieron los 3 problemas).
            // Esto equivale a MAXIMIZAR los participantes "fuertes" (los que SÍ resolvieron los 3).
            //
            // Para que un participante haya resuelto los 3 problemas, debe estar en la intersección
            // de quienes resolvieron A, B y C. El tamaño máximo posible de esa intersección
            // está limitado por el problema que menos gente resolvió: min(a, b, c).
            int maxFuertes = Math.min(a, Math.min(b, c));

            // 4. Cálculo e impresión inmediata del resultado:
            // Total de participantes menos el máximo posible de participantes que resolvieron todo.
            // No es necesario guardar las respuestas en un arreglo; los jueces evalúan la salida estándar.
            System.out.println(participantes - maxFuertes);
        }
        
        in.close();
    }
}
