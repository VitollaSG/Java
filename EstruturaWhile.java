import java.util.Scanner;
public class EstruturaWhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        int soma = 0;

        while (n1 != 0) {

            soma += n1;
            System.out.print("Digite um número: ");
            n1 = sc.nextInt();
        }
        System.out.print(soma);
    }
}
