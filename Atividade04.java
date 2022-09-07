import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int index = 0; index < 5; index++) { 
        double numero = sc.nextDouble();
        
        if (numero % 2 == 0) 
        {
            System.out.println("O numero é par");
        }
        else{
            System.out.println("O numero é impar");
        }
    } 
    sc.close();
}
}
