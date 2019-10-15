package podstawyJęzykaJava;

import java.util.Scanner;

public class TwójWiek
{
    public static void main(String[] args)
    {
        System.out.println("Witam Cię bardzo ciepło, bardzo serdecznie. Jestem programem, który odgadnie Twój wiek");
        System.out.println("bez znajomości roku Twojego urodzenia. Kłaniam się i proszę Cię o wykonywanie");
        System.out.println("następujących instrukcji. Do ich wykonania przyda Ci się kalkulator.");
        System.out.println("Po wykonaniu każdej instrukcji napisz \"ok\" lub \"gotowe\".");
        System.out.println("Oto pierwsza z nich");


        System.out.println("1. Wybierz liczbę całkowitą z przedziału od 1 do 10.");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println("2. Pomnóż wybraną liczbę przez 2");
        String a = scanner.nextLine();
        System.out.println("3. Do otrzymanego wyniku dodaj 5");
        String b = scanner.nextLine();
        System.out.println("4. Pomnóż wynik przez 50");
        String c = scanner.nextLine();
        System.out.println("5. Jeżeli już miałeś urodziny w tym roku to dodaj do otrzymanego wyniku 1769, a jeśli nie" +
                " to dodaj 1768.");
        String d = scanner.nextLine();
        System.out.println("6. Odejmij od liczby, którą otrzymałeś rok swojego urodzenia");
        String e = scanner.nextLine();
        System.out.println("Jeżeli wybrałeś liczbę z przedziału od 1 do 9 to otrzymałeś trzycyfrową liczbę.");
        System.out.println("Dwie ostatnie cyfry to Twój wiek. Natomiast pierwsza to cyfra, którą wybrałeś.");
        System.out.println("W przypadku wyboru 10 otrzymałeś czterocyfrową liczbę. Dwie ostatnie cyfry to Twój wiek,");
        System.out.println("a dwie pierwsze to jedynka i zero.");

    }
}
