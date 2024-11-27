
import java.util.Scanner;

/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
* Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
* Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
 * @author sebas
 */
public class Ejercicio4_jugadoresFutbol {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        String reporte = "Listado Jugadores\n", nombre, posicion;
        int contador = 0, edadSuma = 0, edad;
        double sumaEst = 0, estatura, proEdades, proEst;
        boolean continuar = true;
        while (continuar) {
            contador++;
            System.out.println("Ingrese el nombre del jugador " + contador + ": ");
            nombre = sca.nextLine();

            System.out.println("Ingrese la posición en el campo de juego de " + nombre + ": ");
            posicion = sca.nextLine();

            System.out.println("Ingrese la edad de " + nombre + ": ");
            edad = sca.nextInt();

            System.out.println("Ingrese la estatura (en metros) de " + nombre + ": ");
            estatura = sca.nextDouble();
            sca.nextLine(); 
            reporte += String.format("%d. %s -%s-, edad %d, estatura %.2f\n", 
                                      contador, nombre, posicion, edad, estatura);
            edadSuma += edad;
            sumaEst += estatura;
            System.out.println("¿Desea ingresar otro jugador? (s/n): ");
            String respuesta = sca.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
            proEdades = (double) edadSuma / contador;
            proEst = sumaEst/ contador;
             reporte += String.format("Promedio de edades: %.1f\n", proEdades);
             reporte += String.format("Promedio de estaturas: %.2f\n", proEst);
             System.out.println("\n" + reporte);

             }
         }
/***
 * run:
Ingrese el nombre del jugador 1: 
Alexander Dominguez
Ingrese la posición en el campo de juego de Alexander Dominguez: 
Arquero
Ingrese la edad de Alexander Dominguez: 
32
Ingrese la estatura (en metros) de Alexander Dominguez: 
1,95
¿Desea ingresar otro jugador? (s/n): 
si
Ingrese el nombre del jugador 2: 
Xavier Arreaga
Ingrese la posición en el campo de juego de Xavier Arreaga: 
Defensa
Ingrese la edad de Xavier Arreaga: 
24
Ingrese la estatura (en metros) de Xavier Arreaga: 
1,85
¿Desea ingresar otro jugador? (s/n): 
si
Ingrese el nombre del jugador 3: 
Moises Caicedo
Ingrese la posición en el campo de juego de Moises Caicedo: 
Mediocentro
Ingrese la edad de Moises Caicedo: 
19
Ingrese la estatura (en metros) de Moises Caicedo: 
1,88
¿Desea ingresar otro jugador? (s/n): 
si
Ingrese el nombre del jugador 4: 
Angel Mena
Ingrese la posición en el campo de juego de Angel Mena: 
Delantero
Ingrese la edad de Angel Mena: 
32
Ingrese la estatura (en metros) de Angel Mena: 
1,75
¿Desea ingresar otro jugador? (s/n): 
si
Ingrese el nombre del jugador 5: 
Michael Estrada
Ingrese la posición en el campo de juego de Michael Estrada: 
Delantero
Ingrese la edad de Michael Estrada: 
27
Ingrese la estatura (en metros) de Michael Estrada: 
1,93
¿Desea ingresar otro jugador? (s/n): 
no
 */

