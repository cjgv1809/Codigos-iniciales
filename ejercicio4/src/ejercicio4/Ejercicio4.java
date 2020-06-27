package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double num;
        System.out.println("Introduzca número");
        num = entrada.nextDouble();
        System.out.println("El cubo del número ingresado es igual a:");
        System.out.println(cubo(num));
    }
    public static double cubo(double num){
        return Math.pow(num, 3);
    }   
}
