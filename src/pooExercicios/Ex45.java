package pooExercicios;/*45. Sabendo que triângulo é uma figura geométrica de
três lados em que cada um dos lados é menor que a
soma dos outros dois, faça um algoritmo que rece-
ba três valores e verifique se eles podem ser os com-
primentos dos lados de um triângulo*/

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {

        int arrayValores[];
        int qtdNumDigitados;
        Scanner ler = new Scanner(System.in);
        int valorDigitado;

        System.out.println("Este programa recebe 3 valores referentes ao lado de um triangulo e verifica se podem ser um triangulo\n");
        System.out.println("Informe a quantidade de valores que serão inseridos: ");
        qtdNumDigitados = ler.nextInt();

        arrayValores = new int[qtdNumDigitados];

        //ler valores e colocar no array de valores
        for(int i = 0; i < qtdNumDigitados; i++){

            System.out.printf("Digite o %s valor: ", i);
            arrayValores[i]=ler.nextInt();

        }

        if(((arrayValores[0]+arrayValores[1]) > arrayValores[2]) && ((arrayValores[0]+arrayValores[2]) > arrayValores[1]) && ((arrayValores[1]+arrayValores[2]) > arrayValores[0])){
            System.out.println("é um triaguilo");

        } else {
            System.out.println(" não é um triaguilo");
        }




    }
}
