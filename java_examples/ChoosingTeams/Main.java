import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Lectura de parámetros de entrada:
        // n = total de estudiantes disponibles (1 <= n <= 2000).
        // k = número mínimo de veces que el equipo debe participar junto en el futuro (1 <= k <= 5).
        int n = in.nextInt();
        int k = in.nextInt();

        // 'ans' almacena el total de equipos válidos formados.
        // 'capableStudents' actúa como un acumulador temporal para ir agrupando de 3 en 3.
        int ans = 0;
        int capableStudents = 0;

        // 2. Procesamiento al vuelo:
        // En lugar de guardar las 'n' participaciones en un array y recorrerlo después,
        // evaluamos cada dato conforme se lee de la entrada estándar.
        for (int i = 0; i < n; i++) {
            
            // Veces que el estudiante actual ya participó en el mundial (0 <= times <= 5).
            int times = in.nextInt();

            // 3. CONDICIÓN CLAVE DEL PROBLEMA (Matemática simple / Greedy):
            // Las reglas dicen que el límite máximo de participaciones por persona es 5.
            // Si el estudiante ya participó 'times' veces y necesita participar 'k' veces más,
            // solo es elegible si: times + k <= 5.
            if (times + k <= 5) {
                capableStudents++;
            }

            // 4. Formación inmediata de equipos (Agrupación Greedy):
            // Como el orden en que se agrupan los estudiantes elegibles no importa (cualquier
            // combinación de 3 estudiantes válidos sirve), en cuanto juntamos 3, formamos
            // un equipo nuevo y reiniciamos el contador temporal.
            if (capableStudents == 3) {
                capableStudents = 0;
                ans++;
            }
        }

        // 5. Salida estándar limpia:
        // Nota que 'print' y 'println' son aceptados por el juez al final del archivo.
        System.out.print(ans);
        
        in.close();
    }
}
