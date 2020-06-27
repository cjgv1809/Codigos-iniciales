package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Ingrese el primer número");
        num1=entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=entrada.nextInt();
        System.out.println("Ingrese el tercer número");
        num3=entrada.nextInt();
        System.out.println("El mayor valor ingresado es:");
        System.out.println(mayorDeTres(num1,num2,num3));
        
    }public static int mayorDeTres(int num1,int num2, int num3){
        if ((num1>num2) && (num1>num3)){
            return num1;
        }
        else if (num2>num3){
            return num2;
        }
        else{
            return num3;
        }
    }
}
