import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        int matricula;
        int notaFinal;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a matricula:");
        matricula = ler.nextInt();

        System.out.println("Informe a nota final:");
        notaFinal = ler.nextInt();

        if(notaFinal >= 60){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno Reprovado");
        }




    }

}
