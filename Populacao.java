import java.util.Scanner;

public class Populacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double popA , popB ; 
        int anos = 0;
        double pctB, pctA;

        System.out.println("qual a população do país A e B (respectivamente)?");
        popA = sc.nextDouble();
        popB = sc.nextDouble();

        System.out.println("qual a taxa de crescimento de A e B (respectivamente)?");
        pctA = sc.nextDouble();
        pctB = sc.nextDouble();

        while(pctA < pctB){
            System.out.println("taxa de A tem que ser maior que taxa de B, \ndigite duas taxas válidas");
            pctA = sc.nextDouble();
            pctB = sc.nextDouble();
        }

        
        while(popA < popB){
            //crescimento A
            pctA = (pctA / 100) * popA ;
            popA = popA + pctA;

            //crescimento B
            pctB = (pctB / 100) * popB;
            popB = popB + pctB;

            //contador
            anos++;
        }

        System.out.println("foram necessários " + anos);

        sc.close();

       
    }

    
}
