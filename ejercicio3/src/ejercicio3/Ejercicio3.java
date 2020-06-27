package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num = entrada.nextInt();
        System.out.println(esPar(num));
    }    
    public static boolean esPar(int num){
        if (num%2==0){
            System.out.println("El número ingresado es par");
            return true;
        }else{
            System.out.println("El número ingresado es impar");
            return false;
        }
    }
}