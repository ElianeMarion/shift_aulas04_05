import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        int op, opMenuInterno = 0;
        String nome, user="", senha="", userLogin, senhaLogin;
        do {
            System.out.println("Sistema FIAP" +
                    "\n1 - Cadastrar usuário." +
                    "\n2 - Login." +
                    "\n3 - Sair");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    nome = leitorTexto.nextLine();
                    System.out.println("Digite seu usuário: ");
                    user = leitorTexto.nextLine();
                    System.out.println("Digite sua senha: ");
                    senha = leitorTexto.nextLine();
                    break;
                case 2:
                    System.out.println("Digite seu usuário: ");
                    userLogin = leitorTexto.nextLine();
                    System.out.println("Digite sua senha: ");
                    senhaLogin = leitorTexto.nextLine();
                    if (user.equalsIgnoreCase(userLogin) && senha.equals(senhaLogin)) {
                        do {
                            System.out.println("1 - Calcular pagamento." +
                                    "\n2 - Deslogar");
                            opMenuInterno = leitor.nextInt();
                        }while (opMenuInterno != 2);

                    }
                    break;
            }
        }while (op != 3);
    }
}
