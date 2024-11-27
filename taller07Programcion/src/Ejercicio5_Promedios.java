
import java.util.Scanner;


/**
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
Estudiante1	10	Aprobado
Estudiante2	6.9	Reprobado
Estudiante3	7	Aprobado
Estudiante4	5	Reprobado
Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 * @author sebas
 */
public class Ejercicio5_Promedios {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.println("DAME NOMBRES Y PROMEDIO DEL EST_ " + contador + ": ");
            nombre = sca.next();
            promedio = sca.nextDouble();
            if(promedio >= 7)
                estado = "APROBADO";
            else
                estado = "REPROBADO";
            System.out.printf("| %s | %s | %s\t|\n","NOMBRE","PROMEDIO","ESTADO");
            System.out.printf("| %s\t|  %.2f\t | %s\t|\n", nombre, promedio, estado);
            contador++;
        }
    }
    
}
/**
 * run:
DAME NOMBRES Y PROMEDIO DEL EST_ 1: 
Jose 10
| NOMBRE | PROMEDIO | ESTADO	|
| Jose	|  10,00	 | APROBADO	|
DAME NOMBRES Y PROMEDIO DEL EST_ 2: 
Carlos 6,9
| NOMBRE | PROMEDIO | ESTADO	|
| Carlos	|  6,90	 | REPROBADO	|
DAME NOMBRES Y PROMEDIO DEL EST_ 3: 
Miguel 7
| NOMBRE | PROMEDIO | ESTADO	|
| Miguel	|  7,00	 | APROBADO	|
DAME NOMBRES Y PROMEDIO DEL EST_ 4: 
Juan 5
| NOMBRE | PROMEDIO | ESTADO	|
| Juan	|  5,00	 | REPROBADO	|
BUILD SUCCESSFUL (total time: 21 seconds)
 */