package errores;
import java.util.Scanner;
public class Errores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int o,op;
        calculos error;
        double real, aproximado;
        System.out.println("Para calcular los errores");
        System.out.println("ingrese los valores que se le solicitan acontinución");
        System.out.println("");
        System.out.println("Valor real");
        real = teclado.nextDouble();
        System.out.println("Valor aproximado");
        aproximado = teclado.nextDouble();

        do {
            System.out.println("Que error desea ver?");
            System.out.println("Error absoluto");
            System.out.println("Error relativo");
            System.out.println("Error porcentual");
            o = teclado.nextInt();

            switch (o) {
                case 1:
                     error = new calculos(real, aproximado);
                    System.out.println("El error absoluto es: " + error.errorAbsoluto());
                    break;
                case 2:
                    error = new calculos(real, aproximado);
                    System.out.println("El error relativo es: " + error.errorRelativo());
                    break;
                case 3:
                    error = new calculos(real, aproximado);
                    System.out.println("El error porcentual es: " + error.errorPorcentual());
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
            }
            System.out.println("");
            System.out.println("Desea ver el resultado de otro error? 1.-Si, 2.-No");
            op=teclado.nextInt();
            
         } while(op==1);
    }
    
}
