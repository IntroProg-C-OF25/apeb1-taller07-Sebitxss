
import java.util.Scanner;


/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% 
 * En caso que sea otro tipo de cliente, no hay descuento. 
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author sebas
 */
public class Ejercicio6_ComercioComputador {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        String nombreC;
        double precioCom, precioF, descuento = 0.0;
        int contador = 0, tipoCliente;
        int t_ventas = 7;
        while(contador < t_ventas){
            System.out.println("Registro de ventas #" + (contador+1));
            System.out.print("Ingrese el nombre del cliente: ");
            nombreC = sca.next();
            System.out.print("Ingrese el costo de la computadora: ");
            precioCom = sca.nextDouble();
            System.out.println("Ingrese el tipo de cliente 1 o 2: ");
            tipoCliente = sca.nextInt();
            if (tipoCliente == 1) {
                descuento = 0.10 * precioCom; 
            } else if (tipoCliente == 2) {
                descuento = 0.20 * precioCom;
            }
            precioF = precioCom - descuento;
            System.out.printf("Cliente %s, tipo %d, compra computadora con precio final $%.2f\n",
                    nombreC, tipoCliente, precioF);

            System.out.println("----------------------------------");
            contador++;
        } 
        System.out.println("Registro de ventas finalizado.");
    }
    
}
/**
 * run:
Registro de ventas #1
Ingrese el nombre del cliente: Jose
Ingrese el costo de la computadora: 786
Ingrese el tipo de cliente 1 o 2: 
2
Cliente Jose, tipo 2, compra computadora con precio final $628,80
----------------------------------
Registro de ventas #2
Ingrese el nombre del cliente: Carlos
Ingrese el costo de la computadora: 340
Ingrese el tipo de cliente 1 o 2: 
1
Cliente Carlos, tipo 1, compra computadora con precio final $306,00
----------------------------------
Registro de ventas #3
Ingrese el nombre del cliente: Karla
Ingrese el costo de la computadora: 857
Ingrese el tipo de cliente 1 o 2: 
1
Cliente Karla, tipo 1, compra computadora con precio final $771,30
----------------------------------
Registro de ventas #4
Ingrese el nombre del cliente: Miguel
Ingrese el costo de la computadora: 800
Ingrese el tipo de cliente 1 o 2: 
2
Cliente Miguel, tipo 2, compra computadora con precio final $640,00
----------------------------------
Registro de ventas #5
Ingrese el nombre del cliente: Renato
Ingrese el costo de la computadora: 256
Ingrese el tipo de cliente 1 o 2: 
1
Cliente Renato, tipo 1, compra computadora con precio final $230,40
----------------------------------
Registro de ventas #6
Ingrese el nombre del cliente: Sarahí
Ingrese el costo de la computadora: 347
Ingrese el tipo de cliente 1 o 2: 
1
Cliente Sarahí, tipo 1, compra computadora con precio final $312,30
----------------------------------
Registro de ventas #7
Ingrese el nombre del cliente: Juan
Ingrese el costo de la computadora: 400
Ingrese el tipo de cliente 1 o 2: 
2
Cliente Juan, tipo 2, compra computadora con precio final $320,00
----------------------------------
Registro de ventas finalizado.
BUILD SUCCESSFUL (total time: 1 minute 45 seconds)
 */