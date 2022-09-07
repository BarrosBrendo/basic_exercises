import java.util.Scanner;

public class Atividade
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    double valor1 = sc.nextDouble();

     System.out.println("Quanto você tirou em Matematica? " + valor1);
     System.out.println("Escreva seu nome = " + name);
       
     if (valor1 >= 6) {
        System.out.println("Você foi aprovado.");
     }
     else{
        System.out.println("Você foi reprovado.");
     }
     sc.close();
    }  
}


    

