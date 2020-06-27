package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num;
        System.out.println("Introduzca número");
        num = entrada.nextInt();
        System.out.println("La cantidad de divisores del número ingresado es:");
        System.out.println(cantidadDeDivisores(num));
    }
    public static int cantidadDeDivisores(int num){
        int cantidad=0;
        for (int n = 1; n <= num; n++) {
            if (num%n==0){
                cantidad++;
            }      
        }
        return cantidad;
    }
}
