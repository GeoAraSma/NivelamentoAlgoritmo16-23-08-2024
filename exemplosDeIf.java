import java.util.Scanner;

public class exemplosDeIf {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        Integer numint = sc.nextInt();

        if(numint%2==0){
            System.out.println(numint+" é par.");
        } else {
            System.out.println(numint+" é impar.");
        }

    }
}
