import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora = sc.nextDouble();
        
        if (hora >= 10) {
             System.out.println("Largou! " + hora);
        }
        else{
            System.out.println("Espere dar 10 horas! " + hora);
        }
    sc.close();
    }
}
