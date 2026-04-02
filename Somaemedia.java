import java.util.Scanner;

public class Somaemedia {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0, n, soma = 0;
    
    while(contador < 5){
     System.out.println("digite um número");
         n = sc.nextInt();
         
         soma = soma + n;
         contador++;
    }

   double media = soma / 5.0;
   
   System.out.println("soma = "+ soma + "\nmedia = "+media);

   sc.close();
 }
    
}
