import java.util.Scanner;
public class EquacaoQuadratica {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.print("Digite o primeiro coeficiente da equação: ");
        int a = sc.nextInt();

        if (a == 0){
            System.out.print(("[ERRO] O primeiro coeficiente não pode ser zero!"));
            System.exit(0);

        }else {

            System.out.print("Digite o segundo coeficiente da equação: ");
            int b = sc.nextInt();

            System.out.print("Digite o terceiro coeficiente da equação: ");
            int c = sc.nextInt();

            sc.close();

            double delta = Math.pow(b, 2) - (4 * a * c);
            //System.out.printf("%.0f%n", delta);

            if (delta < 0) {
                System.out.print("Não possui raizes reais!");

            } else if (delta == 0) {

               double x = (double) -b / (2 * a);

                System.out.printf("Possui apenas uma raiz real, que é %.2f", x);

            } else {

                double x1 = -b + (Math.sqrt(delta) / 2 * a);
                double x2 = -b - (Math.sqrt(delta) / 2 * a);

                System.out.printf("Possui duas raizes reais e distintas, que são %.2f e %.2f%n", x1, x2);
            }
        }
    }
}


