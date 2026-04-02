import java.util.Scanner;

public class Fichauser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("qual o seu nome?");
        String nome = sc.next();

        while(nome.length() <= 3){
            System.out.println("o nome tem que ser maior que 3 caracteres" + 
                ", digite novamente"
            );
            nome = sc.next();
        }

        System.out.println("qual a sua idade? ");
        int idade = sc.nextInt();

        while(idade > 150 || idade <= 0){
            System.out.println("idade inválida, digite novamente");
            idade = sc.nextInt();
        }

        System.out.println("qual o seu salário?");
        double salario = sc.nextDouble();

        while(salario <= 0){
            System.out.println("digite um salário válido");
            salario = sc.nextDouble();
        }

        System.out.println("qual o seu sexo? [F ou M]");
        char sexo = sc.next().charAt(0);

        sexo = Character.toUpperCase(sexo);

        while(sexo != 'F' && sexo != 'M'){
            System.out.println("sexo inválido, tente novamente");
            sexo = sc.next().charAt(0);
        }

        System.out.println("qual o seu estado civil? \ncasado [c] \nsolteiro[s] \nviúvo[v] \ndivorciado[d]");
        char civil = sc.next().charAt(0);

        civil = Character.toUpperCase(civil);

        while(civil != 'S' && civil != 'C' && civil != 'V' && civil != 'D' ){
            System.out.println("estado civil inválido, tente novamente");
            civil = sc.next().charAt(0);
        }

        System.out.println("nome - " + nome + "\nidade - " + idade + 
            "\nsalário - " + salario + "\nsexo - " + sexo + "\nestado civil - " + civil
        );
        
        sc.close();


    }
}
