/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.Scanner;
public class Maquinavenda {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = {50,20,10,5,2,1};
        System.out.println("digite o valor da compra: R$ ");
        int valorcompra = scanner.nextInt();
        System.out.println("digite o valor pago: R$ ");
        int valorpago = scanner.nextInt();
        
        if(valorpago < valorcompra){
            System.out.println("Pagamento insuficiente");}
            else{
                int troco = valorpago - valorcompra;
                System.out.println("troco a ser dado; R$ " + troco);
                for (int nota : notas){
                if (troco >= nota){
                    int qtdnotas = troco/ nota;
                    troco %= nota;
                    System.out.println(qtdnotas + " nota(s) de R$ " + nota);
                }
            }
        }
        scanner.close();
}
}