package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        char caracter;
        int numero;
        System.out.println("Ingrese símbolo");
        caracter = entrada.next().charAt(0);
        System.out.println("Ingrese número de veces a mostrar el símbolo");
        numero = entrada.nextInt();
        imprimirSimbolo(numero,caracter);
        
    }
    public static void imprimirSimbolo(int numero,char caracter){
            for (int i = 1; i <= numero; i++) {
                System.out.print(caracter);
            }
    }   
}
