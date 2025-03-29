import java.util.Scanner;

public class maiormenormedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        double maior = Math.max(num1, Math.max(num2, num3));
        double menor = Math.min(num1, Math.min(num2, num3));
        
        double media = (num1 + num2 + num3) / 3;
        
      
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média aritmética: %.2f", media);
        
        scanner.close();
    }
    }
