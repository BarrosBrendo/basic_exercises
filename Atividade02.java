import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double resultado;

        if (valor2 <= 0) {
            System.out.println("ERRO!");
        }
        else{
            resultado = valor1 / valor2;
            System.out.println(resultado);  
        }
        sc.close();
    }
}
