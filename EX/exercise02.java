package EX;

import java.util.Scanner;

public class exercise02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double salario01 = sc.nextDouble();
        double salario02 = sc.nextDouble();
        double salario03 = sc.nextDouble();
        double salario04 = sc.nextDouble();
        double media;

        media = salario01 + salario02 + salario03 + salario04 / 4;
        
        System.out.println("Salario01 =" + salario01);
        System.out.println("Salario02 =" + salario02);
        System.out.println("Salario03 =" + salario03);
        System.out.println("Salario04 =" + salario04);
        System.out.println("A media é de = " + media);
        sc.close();
    }  
}
