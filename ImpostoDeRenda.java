import java.util.Scanner;
//import java.util.Locale;
public class ImpostoDeRenda {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Locale.setDefault(Locale.US);

        System.out.print("Digite seu salário: ");
        double sal = sc.nextDouble();

        sc.close();

        if (sal < 2000.00){
            System.out.print("Isento a imposto de renda.");

        }else if ((sal >= 2000.00) && (sal <= 3000.00)){
            System.out.printf("Valor do imposto de renda é de R$ %.2f reais", (sal * 8)/100);

        }else if((sal > 3000.00) && (sal <= 4000.00)){
            System.out.printf("Valor do imposto de renda é de R$ %.2f reais", (sal * 18)/100);

        }else {
            System.out.printf("Valor do imposto de renda é de R$ %.2f reais", (sal * 28)/100);
        }
    }
}
