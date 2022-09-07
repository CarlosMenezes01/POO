package pooExercicios;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        double salario;
        double salComAumento;
        char classe;

        Scanner ler = new Scanner(System.in);

        System.out.println("Esse programa calcula salario do funcionario e dar um aumento baseado na sua classe");

        System.out.println("Informe o salario do funcionario");
        salario = ler.nextDouble();

        System.out.println("Informe a classe do funcionario: a, b ou c");
        classe = ler.next().charAt(0);

        switch (classe){

            case 'a':
                salComAumento = salario + (salario*0.1);
                System.out.println("O salario com aumento é: "+ salComAumento);
                break;
            case 'b':
                salComAumento = salario + (salario*0.15);
                System.out.println("O salario com aumento é: "+ salComAumento);
                break;
            case 'c':
                salComAumento = salario + (salario*0.2);
                System.out.println("O salario com aumento é: "+ salComAumento);
                break;
            default:
                System.out.println("A classe informada não é valida");
        }



    }



}
