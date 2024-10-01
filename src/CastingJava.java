import java.util.Scanner;

public class CastingJava {
    public static void main (String[] args){
        //CASTING DE VARIABLES
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite un valor o cadena de entrada: ");
        String entrada= scanner.nextLine();
        try {
            int valorEntero = Integer.parseInt(entrada);
            System.out.println("La entrada es entero: " + valorEntero);
            } catch(NumberFormatException e1){
                try {
                    double valorDouble = Double.parseDouble(entrada);
                    System.out.println("La entrada es decimal: " + valorDouble);
                }catch(NumberFormatException e2){
                        System.out.println("La entrada digitada es Cadena: " + entrada);
                    }
                }
            }
        }
