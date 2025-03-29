/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
import java.util.Scanner;
import java.util.Random;

public class SorteioNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();  
      
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);
             
        int numeroSorteado = random.nextInt((maior - menor) + 1) + menor;
      
        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " - Ele é par.");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " - Ele é ímpar.");
        }
        
        scanner.close();
    }
}