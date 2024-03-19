import java.util.Scanner;

public class SomarComFor {
    public static void main(String[] args) {

        //Diminuir o número de variáveis
        Scanner leitor = new Scanner(System.in);
        int n, soma = 0;
        //repetir a leitura e soma 5x
        //Laço contado
        for(int contador = 1; contador <= 5; contador+=2){
            System.out.println("Informe o " + contador + " numero: ");
            n = leitor.nextInt();
            soma = soma + n;
        }
        System.out.println("Soma = " + soma);

        for(int i = 10; i>=1; i-=3)
            System.out.println(i );
    }
}
