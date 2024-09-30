import java.util.Scanner;

public class CastingJava {
    public static void main (String[] args){
        //CASTING DE VARIABLES
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite el valor que desea transformar: ");
        String entrada= scanner.nextLine();
        try {
            int valorEntero = Integer.parseInt(entrada);
            System.out.println("El valor digitado es entero: " + valorEntero);
            } catch(NumberFormatException e1){
                try {
                    double valorDouble = Double.parseDouble(entrada);
                    System.out.println("El valor digitado es decimal: " + valorDouble);
                }catch(NumberFormatException e2){
                        System.out.println("La entrada digitada es Cadena: " + entrada);
                    }
                }
            }
        }
