package podstawyJęzykaJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrażeniaRegularne
{
    public static void main (String args[])
    {
       /*Pattern p = Pattern.compile("Java");
       Matcher m = p.matcher("Programowanie Java");
       System.out.println(m.matches());
       System.out.println(m.find());*/
         System.out.println("Podaj kod pocztowy:");
         Pattern p = Pattern.compile("[0-9]{2}-[0-9]{3}");
         Scanner scanner = new Scanner(System.in);
         String x = scanner.nextLine();
         Matcher m = p.matcher(x);
         if(m.matches()==false)
         {
             System.out.println("Podałeś niepoprawny kod pocztowy.");
         }

    }
}
