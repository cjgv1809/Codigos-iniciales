package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num1,num2;
        char operacion;
        System.out.println("Ingrese el primer número");
        num1=entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=entrada.nextInt();
        System.out.println("¿Cuál operación desea efectuar?");
        System.out.println("Ingrese S para suma");
        System.out.println("Ingrese R para resta");
        operacion=entrada.next().charAt(0);
        if ((operacion == 'S') || (operacion == 's')){
            double resultado1 = sumarNumeros(num1,num2);
            System.out.println("El resultado es igual a:");
            System.out.println(resultado1);
        }
        else if ((operacion == 'R') || (operacion == 'r')){
            double resultado2 = restarNumeros(num1,num2);
            System.out.println("El resultado es igual a:");
            System.out.println(resultado2);
        }
    }
    public static double sumarNumeros(int num1,int num2){
        double res = num1+num2;
        return res;
    }
    public static double restarNumeros(int num1,int num2){
        double res = num1-num2;
        return res;
    }
}
