import java.util.Scanner;
public class Combustiveis{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int g = 0;
        int d = 0;
        int n = 0;

        while (n != 4){
            System.out.println("==========TABELA DE COMBUSTÍVEIS==========");
            System.out.println("1 PARA ALCOOL");
            System.out.println("2 PARA GASOLINA");
            System.out.println("3 PARA DIESEL");
            System.out.println("4 PARA ENCERRAR");
            System.out.println("===========================================");

            System.out.println("Digite o número correspondente ao seu combustível");
            n = sc.nextInt();

            if ((n > 4) || (n < 1)) {
                System.out.print("Valor inválido, favor verifique e tente novamente!");
                break;

            }else{

                if (n == 1) {
                    a++;

                }else if (n == 2) {
                    g++;

                }else if (n ==3) {
                    d++;

                }else{

                    System.out.println("MUITO OBRIGADO");
                    System.out.printf("Álccol %d%n",a);
                    System.out.printf("Gasolina %d%n",g);
                    System.out.printf("Diesel %d%n",d);

                }
            }
        }
    }
}
