
/* 38. Faça um programa que leia o valor do salário bruto
        de um funcionário. Se o salário for menor ou igual
        a R$ 500,00, o programa deve aplicar um aumento
        de 0.10 (10%)
        42. Como complemento ao exercício 38, o programa
        deverá aplicar também um aumento de 0.05 (5%), se
        o salário for maior do que R$ 500,00.*/

import java.util.Scanner;

public class Ex42 {

    public static void main(String[] args) {

        double salaBruto;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o valor do salario bruto:");
        salaBruto = ler.nextDouble();

        if (salaBruto <= 500){
            salaBruto = salaBruto + (salaBruto*0.10);
            System.out.println("O valor do salario é menor que 500, então recebe 10%: "+ salaBruto);

        }else {
            salaBruto = salaBruto + (salaBruto*0.05);
            System.out.println("O valor do salario é menor que 500, então recebe 5%: "+ salaBruto);
        }
    }
}
