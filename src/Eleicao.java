import java.util.Scanner;

public class Eleicao {
    /*
    Em uma cidade haverá uma eleição. Existem 3 candidatos:
    1 – Huguinho
    2 – Zezinho
    3 – Luizinho

    Diversos eleitores votarão; por não sabermos a quantidade a eleição será encerrada
com a digitação de 0(zero) no voto. Implemente as seguintes rotinas neste
programa:
     a)ler os votos, acumular os votos de cada candidato e exibir a apuração.
     b) Caso seja digitado um voto inválido (diferente de 0, 1, 2 e 3) acumular o
        voto como nulo, exibindo a apuração.
     c) Sabendo-se o total de votos, calcular a porcentagem atingida por cada
        candidato e exibir.
     d) Ao finalizar o algoritmo, exibir os candidatos – e as informações
respectivas da apuração

    APURAÇÃO
    1.o –> 2 – Zezinho - 25 votos – 50%
    2.o –> 1 – Huguinho - 20 votos – 40%
    3.o –> 3 – Luizinho - 5 votos – 10%
    * */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int voto, qtdVotoHuguinho = 0, qtdVotoZezinho = 0, qtdVotoLuizinho = 0;
        double pHuguinho, pZezinho, pLuizinho;
        int qtdVotoNulo = 0;
        do{
            System.out.println("Eleição" +
                    "\nDigite: \n1 - Huguinho\n2 - Zezinho\n3 - Luizinho");
            voto = leitor.nextInt();
            switch (voto){
                case 1:
                    qtdVotoHuguinho++;
                    break;
                case 2:
                    qtdVotoZezinho++;
                    break;
                case 3:
                    qtdVotoLuizinho++;
                    break;
                case 0:
                    System.out.println("Votação finalizada");
                default:
                    qtdVotoNulo++;
                    break;
            }
        }while(voto != 0);
        int soma = qtdVotoHuguinho + qtdVotoLuizinho + qtdVotoZezinho + qtdVotoNulo;
        pZezinho =  (double) (100 * qtdVotoZezinho) / soma;
        pHuguinho =  (double) (100 * qtdVotoHuguinho) / soma;
        pLuizinho =  (double) (100 * qtdVotoLuizinho) / soma;
        double pNulo = (double) (100 * qtdVotoNulo) / soma;
       /* System.out.println("APURAÇÃO\n" +
                "\nHuguinho - " + qtdVotoHuguinho + " - " + pHuguinho + "%" +
                "\nLuizinho - " + qtdVotoLuizinho + " - " + pLuizinho + "%" +
                "\nZezinho - " + qtdVotoZezinho + " - " + pZezinho + "%" +
                "\nNulo - " + qtdVotoNulo + " - " + pNulo + "%" );*/

        if(qtdVotoLuizinho > qtdVotoHuguinho && qtdVotoLuizinho > qtdVotoZezinho){
            System.out.println("1º Luizinho - " + qtdVotoLuizinho +  " - " + pLuizinho + "%" );
            if(qtdVotoZezinho > qtdVotoHuguinho) {
                System.out.println("2º Zezinho - " + qtdVotoZezinho + " - " + pZezinho + "%");
                System.out.println("3º Huguinho - " + qtdVotoHuguinho + " - " + pHuguinho + "%");
            }else {
                System.out.println("2º Huguinho - " + qtdVotoHuguinho +  " - " + pHuguinho + "%" );
                System.out.println("3º Zezinho - " + qtdVotoZezinho +  " - " + pZezinho + "%" );}
        }
        else if(qtdVotoHuguinho > qtdVotoLuizinho && qtdVotoHuguinho > qtdVotoZezinho){
            System.out.println("1º Huguinho - " + qtdVotoHuguinho +  " - " + pHuguinho + "%" );
            if(qtdVotoZezinho > qtdVotoLuizinho) {
                System.out.println("2º Zezinho - " + qtdVotoZezinho + " - " + pZezinho + "%");
                System.out.println("3º Luizinho - " + qtdVotoLuizinho + " - " + pLuizinho + "%");
            }else {
                System.out.println("2º Luizinho - " + qtdVotoLuizinho + " - " + pLuizinho + "%");
                System.out.println("3º Zezinho - " + qtdVotoZezinho + " - " + pZezinho + "%");
            }
        }
        else{
            System.out.println("1º Zezinho - " + qtdVotoZezinho +  " - " + pZezinho + "%" );
        }

    }
}
