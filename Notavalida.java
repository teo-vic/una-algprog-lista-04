import java.util.Scanner;

public class Notavalida{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);


    System.out.println("digite uma nota entre 0 - 10");
    int nota = sc.nextInt();

    int newnota = nota;
     
    while(newnota > 10 || newnota < 0){
      System.out.println("inválido, digite uma nota válida");
      newnota = sc.nextInt();
    }

    System.out.println("nota válida");

    sc.close();


}
}