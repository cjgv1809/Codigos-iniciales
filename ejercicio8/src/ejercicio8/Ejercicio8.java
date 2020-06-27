package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num;
        System.out.println("Ingrese número");
        num = entrada.nextInt();
        System.out.println("El número aleatorio dentro del rango definido es:");
        System.out.println(azar(num));
    }
    public static int azar(int num){
        return (int) (Math.random() * num);
    }
}
    

