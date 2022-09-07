package pooExercicios;

import java.util.Scanner;

public class Ex51 {

    public static void main(String[] args) {

        int notas[];
        int media = 0;
        int somaMed = 0;
        Scanner ler = new Scanner(System.in);

        notas = new int[5];

        for (int i = 0; i <= 4; i++){

            System.out.printf("Informa a nota numero %d\n", i);
            notas[i] = ler.nextInt();
            somaMed = somaMed + notas[i];
            System.out.println(somaMed);

        }

        media = somaMed/5;
        System.out.println("O valor da media é: "+ media);
//

    }

}
