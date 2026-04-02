import java.util.Scanner;

public class MaiorN {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, cont = 0, maior = 0;
 
    while(cont <= 5){
        System.out.println("digite um número");
        N = sc.nextInt();
        
        if(N > maior){
            maior = N;
        }

        cont++;

    }

 System.out.println("maior número - "+maior);

 sc.close();

   } 
}
