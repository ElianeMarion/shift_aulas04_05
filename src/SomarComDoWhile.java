import java.util.Scanner;

public class SomarComDoWhile {
    public static void main(String[] args) {
        //Diminuir o número de variáveis
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        int n, soma, qtdNumeros;
        String continuar; // = "S"; //INICIALIZAÇÃO
        //while (continuar.equals("S") || continuar.equals("s") || continuar.equals("SIM") )
        do {
            soma = 0;
            System.out.println("Informe quantos notas você deseja somar: ");
            qtdNumeros = leitor.nextInt();
            //repetir a leitura e soma 5x
            int contador = 1; //inicialização
            //while(condição)
            while (contador <= qtdNumeros) {   //teste da condição "limite superior"
                System.out.println("Informe a " + contador + " nota: ");
                n = leitor.nextInt();
                soma = soma + n;
                contador++;   //incremento
            }
            System.out.println("Soma = " + soma);
            System.out.println("Média = " + soma / qtdNumeros);
            System.out.println("Deseja verificar a média de outra turma? " +
                    "[S] - Sim ou [N] -Não");
            continuar = leitorTexto.nextLine(); //LEITURA É DETERMINA A MUDANÇA DA CONDIÇÃO
        }while (continuar.equalsIgnoreCase("S"));
    }
}
