/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
import java.util.Scanner;

public class CalculoCirculoEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592;
        
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = scanner.nextInt();
        
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        
        switch (operacao) {
            case 1:
                System.out.println("Perímetro do círculo: " + (2 * PI * raio));
                break;
            case 2:
                System.out.println("Área do círculo: " + (PI * raio * raio));
                break;
            case 3:
                System.out.println("Volume da esfera: " + ((4.0 / 3.0) * PI * Math.pow(raio, 3)));
                break;
            default:
                System.out.println("Código da operação inválido.");
        }
        
        scanner.close();
    }
}
