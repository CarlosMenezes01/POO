import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        char sexo;
        Scanner ler = new Scanner(System.in);
        int i;
        for (i=0;i < 10; i++) {
            System.out.println("Informe o sexo - M ou F");
            sexo = ler.next().charAt(0);
            if (sexo == 'M' || sexo == 'F') {
                System.out.println("Sexo valido");
            } else {
                System.out.println("O sexo é INvalido");
            }
        }
    }

}
