import java.util.Scanner;

public class Entredois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite dois números");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while(n1 != n2){
            n1++;
            System.out.println(n1);
        }

        sc.close();
    }
    
}
