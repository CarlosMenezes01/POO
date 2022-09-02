import java.util.Scanner;

public class Ex41 {

    // Faça um programa que leia um número dado como
    //entrada e apresente a mensagem “O número está na
    //faixa de 20 a 90” se o valor fornecido estiver entre
    //20 e 90.
    public static void main(String[] args) {

        int numero;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero:");
            numero = ler.nextInt();

            if (numero > 20 && numero < 90) {
                System.out.println("O número esta na faixa de 20 a 90");

            }else {
                System.out.println("O número não esta na faixa de 20 a 90");

            }

        }
    }
}
