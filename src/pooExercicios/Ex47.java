package pooExercicios;

import java.util.Scanner;

public class Ex47   {

    public static void main(String[] args) {

        double salBruto;
        double salLiquido;


        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o salario bruto:");
        salBruto = ler.nextDouble();

        if(salBruto < 1500.00){
            salLiquido = salBruto - (salBruto*0.08);
        }else {
            salLiquido = salBruto - (salBruto*0.11) - (salBruto*0.05);
        }

        System.out.println("O salario liquído é de: "+salLiquido);


    }




}
