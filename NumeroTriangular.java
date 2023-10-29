import java.util.Scanner;
public class NumeroTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String res = "n";

        int triangular1 = 1;
        int somaTriangular = 0;
        int n1 = 0;

        System.out.print("Digite um número: ");
        n1 = sc.nextInt();

        //do {
            while (somaTriangular < n1) {

                somaTriangular = triangular1 * (triangular1 + 1) / 2;
                triangular1++;
                //System.out.println(somaTriangular);
            }
            if (n1 != somaTriangular) {

                System.out.println("Não é triangular");

            } else {
                System.out.println("É triangular");
            }

        //}while (res != "n"); 
        // System.out.print("Deseja continuar? [s/n] ");
        //res = sc.next();

    }
}