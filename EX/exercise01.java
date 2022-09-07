package EX;

import java.util.Scanner;

public class exercise01 
{
        public static void main(String[] args)
        {
                 Scanner sc = new Scanner(System.in);
                 double celsisus = sc.nextDouble();
                    
                 double  kelvin, reaumur, rankine, fahrenheit;
                    
                 kelvin = celsisus + 273.15;
                 fahrenheit = celsisus * 1.8 + 32;
                 reaumur = celsisus * 0.8;
                 rankine = celsisus * 1.8 + 32 + 459.67;
                 System.out.println("Celsius=" + celsisus);
                 System.out.println("Kelvin=" + kelvin);
                 System.out.println("Reaumur=" + reaumur);
                 System.out.println("Rankine=" + rankine);
                 System.out.println("Fahrenheit=" + fahrenheit);
                 sc.close();   
        }
}
