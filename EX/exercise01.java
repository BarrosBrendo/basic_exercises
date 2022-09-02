package EX;

import java.util.Scanner;

public class exercise01 
{
        public static void main(String[] args)
    {
        try (Scanner Sc = new Scanner(System.in)) {
            double Celsisus = Sc.nextDouble();
            
            double  Kelvin, Reaumur, Rankine, Fahrenheit;
            
            Kelvin = Celsisus + 273.15;
            Fahrenheit = Celsisus * 1.8 + 32;
            Reaumur = Celsisus * 0.8;
            Rankine = Celsisus * 1.8 + 32 + 459.67;
            System.out.print("Celsius=" + Celsisus);
            System.out.print("Kelvin=" + Kelvin);
            System.out.print("Reaumur=" + Reaumur);
            System.out.print("Rankine=" + Rankine);
            System.out.print("Fahrenheit=" + Fahrenheit);
        } 
    }
   
}
