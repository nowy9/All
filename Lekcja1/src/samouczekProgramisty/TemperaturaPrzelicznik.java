package samouczekProgramisty;

import java.util.Scanner;

public class TemperaturaPrzelicznik
{
    public static void main (String args[])
    {
        System.out.println("Wybierz 1 jeśli chcesz przeliczyć stopnie Celsjusza na Fahrenheita.");
        System.out.println("Wybierz 2 jeśli chcesz przeliczyć stopnie Fahrenheita na Celsjusza.");
        Scanner scanner = new Scanner (System.in);
        String x = scanner.nextLine();
        switch (x)
        {
            case "1":
                {
                System.out.println("Podaj temperaturę.");
                double temp = scanner.nextDouble();
                double tempf = 9 * temp / 5 + 32;
                System.out.println("W stopniach Fahrenheita jest to: " + tempf);
                break;
                }
            case "2":
                {
                System.out.println("Podaj temperaturę.");
                double tempff = scanner.nextDouble();
                double tempp = (5 * tempff - 160) / 9;
                System.out.println("W stopniach Celsjusza jest to: " + tempp);
                break;
                }
            default:
                {
                System.out.println("Wybierz 1 albo 2.");
                }
        }

    }

}

