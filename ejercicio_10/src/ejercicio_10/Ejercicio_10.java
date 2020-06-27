package ejercicio_10;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int nMes;
        System.out.println("Ingrese el número de mes");
        nMes = entrada.nextInt();
        System.out.println(obtenerMesEnTexto(nMes));
    }
    public static String obtenerMesEnTexto(int nMes){
        switch (nMes){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Numero de mes incorrecto";
        }
    }
}