
/**
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author sebas
 */
public class Ejercicio7_ImprimirSumatoria {
    public static void main(String[] args) {
        System.out.println(" ");
        int n = 10;
        double sumatoria = 0; 
        int i = 1; 

        while (i <= n) {
            if (i % 2 == 0) {
                sumatoria += 1.0 / i;
            } else {
                sumatoria -= 1.0 / i;
            }
            i++; 
        }
        System.out.println("La sumatoria es: " + sumatoria);
    }
    
}
