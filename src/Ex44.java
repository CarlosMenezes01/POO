/*Faça um programa que leia três valores distintos a
serem digitados pelo usuário, determine e exiba o
menor deles.*/

import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {

        int a, b, c, menorValor, maiorValor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o valor A:");
        a = ler.nextInt();

        System.out.println("Entre com o valor B:");
        b = ler.nextInt();

        System.out.println("Entre com o valor C:");
        c = ler.nextInt();

        menorValor = a; // considero que o menor é zero

        if(a < menorValor){
            menorValor = a;
        } else if(b < menorValor){
            menorValor = b;
        }else if(c < menorValor){
            menorValor = c;
        }
        System.out.println("o menor valor é: "+menorValor);

    }
}
