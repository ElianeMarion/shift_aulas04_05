import java.util.Scanner;

public class SomarNumeros2 {
    public static void main(String[] args) {

        //Diminuir o número de variáveis
        Scanner leitor = new Scanner(System.in);
        int n, soma = 0;

        System.out.println("Informe o numero: ");
        n = leitor.nextInt();
        soma = soma + n;

        System.out.println("Informe o numero: ");
        n = leitor.nextInt();
        soma = soma + n;

        System.out.println("Informe o numero: ");
        n = leitor.nextInt();
        soma = soma + n;

        System.out.println("Informe o numero: ");
        n = leitor.nextInt();
        soma = soma + n;

        System.out.println("Informe o numero: ");
        n = leitor.nextInt();
        soma = soma + n;

        System.out.println("Soma = " + soma);


    }
}
