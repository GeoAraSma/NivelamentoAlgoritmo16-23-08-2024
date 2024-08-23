import java.util.Scanner;

public class comparacaomaiornumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Informe outro valor inteiro diferente do primeiro: ");
        int num2 = sc.nextInt();


        if (num1>num2){
            System.out.println(num1+" é maior que "+num2);
        } else if (num1<num2) {
            System.out.println(num1+" é menor que "+num2);
        } else {
            System.out.println(num1+" é igual a "+num2);
        }

    }
}
