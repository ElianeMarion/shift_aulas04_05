import java.util.Scanner;

public class SomarComWhile {
    public static void main(String[] args) {

        //Diminuir o número de variáveis
        Scanner leitor = new Scanner(System.in);
        int n, soma = 0;
        //repetir a leitura e soma 5x
        int contador=1;
        //while(condição)
        while(contador <= 5){
            System.out.println("Informe o " + contador + " numero: ");
            n = leitor.nextInt();
            soma = soma + n;
            contador++;
        }
        System.out.println("Soma = " + soma);
    }
}
