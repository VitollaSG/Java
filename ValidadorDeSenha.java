import java.util.Scanner;
public class ValidadorDeSenha {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite sua nova senha: ");
        //int senhaAtual = sc.nextInt();
        int senhaAtual = 133520;
        int senha = 0;

        while (senha != senhaAtual ){

            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();

            if (senha != senhaAtual) {

                System.out.println("Senha inválida! ");
            }else {

                System.out.println("Acesso permitido! ");
            }
        }
    }
}
