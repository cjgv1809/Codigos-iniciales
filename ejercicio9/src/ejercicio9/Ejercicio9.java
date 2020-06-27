package ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        char letra;
        System.out.println("Introduzca letra");
        letra = entrada.next().charAt(0);
        System.out.println(esVocal(letra));
    }
    public static boolean esVocal(char letra){
        if ((letra=='a') || (letra=='A')) {
            System.out.println("La letra ingresada es una vocal");
            return true;
        }
        else if ((letra=='e') || (letra=='E')){
            System.out.println("La letra ingresada es una vocal");
            return true;
        }
        else if ((letra=='i') || (letra=='I')){
            System.out.println("La letra ingresada es una vocal");
            return true;
        }
        else if ((letra=='o') || (letra=='O')){
            System.out.println("La letra ingresada es una vocal");
            return true;
        }
        else if ((letra=='u') || (letra=='U')){
            System.out.println("La letra ingresada es una vocal");
            return true;
        }
        else{
            System.out.println("La letra ingresada no es una vocal");
            return false;
        }
    }
}
    
