package samouczekProgramisty;

import java.util.Scanner;

public class Temperatura
{
    public static void main (String args[])
    {
        System.out.println("Podaj temperaturę w stopniach Celsjusza.");
        double temp;
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextDouble();
        double tempf;
        tempf = (9 * temp)/5 + 32;
        System.out.println("W stopniach Fahrenheita jest to: " + tempf);
        if (temp>0)
        {
            System.out.println("W stopniach Celsjusza ta temperatura jest dodatnia.");
        }
        else if (temp<0)
        {
            System.out.println("W stopniach Celsjusza ta temperatura jest ujemna.");
        }
        else
        {
            System.out.println("W stopniach Celsjusza ta temperatura wynosi 0.");
        }
        if (tempf>0)
        {
            System.out.println("W stopniach Fahrenheita ta temperatura jest dodatnia.");
        }
        else if (tempf<0)
        {
            System.out.println("W stopniach Fahrenheita ta temperatura jest ujemna.");
        }
        else
        {
            System.out.println("W stopniach Fahrenheita ta temperatura wynosi 0.");
        }

    }
}
