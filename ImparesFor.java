import java.util.Scanner;
public class ImparesFor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.print ("Digite até que número você quer verificar os impáres: ");
        int quantidade = sc.nextInt();

        for (int x = 1; x <= quantidade; x++){

            if (x % 2 != 0){
                System.out.println(x);


            }
        }
    }
}
