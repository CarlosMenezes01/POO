import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {

        int numero;
        int resto;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        numero = ler.nextInt();
        resto = numero % 5;

        if(resto == 0){
            System.out.println("Esse numero é divisivil por 5 ");
        }

    }
}
