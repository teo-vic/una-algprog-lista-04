import java.util.Scanner;

public class Senhaeuser {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);


    System.out.println("Digite seu nome de usuário");
    String user = sc.next();

    System.out.println("Digite uma senha (letras)");
    String senha = sc.next();

    while(senha.equalsIgnoreCase(user)){
        System.out.println("Senha tem que ser diferente de usuário");
        senha = sc.next();
    }

    System.out.println("Senha válida");
    
    sc.close();

 }    
}
