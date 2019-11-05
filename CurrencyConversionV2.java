/**
 * Hallie Jenkins
 * 09/26/19
 */
import java.util.Scanner;
public class CurrencyConversionV2
{   
    public static void main(String [ ] args)
    {
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        
        System.out.println("Please enter a currency value: ");
        Scanner in = new Scanner(System.in);
        double currencyValue = in.nextDouble();
        
        System.out.println("Please enter the exchange rate: ");
        Scanner d = new Scanner(System.in);
        double exchangerate = in.nextDouble();
        System.out.println();
        
        System.out.println("New currency value: " + exchangerate*currencyValue);
        
            
    }
}     

