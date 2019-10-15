package podstawySceneBuildera;

import java.util.Scanner;

public class Quiz
{
    public static void main(String[] args)
    {
        int punkty = 0;
        String [] odpDobre = new String [] {"A", "C", "A", "D", "B", "B", "C", "A", "D", "D"};
        String [] odpGracza = new String[10];
        System.out.println("Witaj w quizie historycznym. Składa się on z dziesięciu pytań.");
        System.out.println("Za każdą prawidłową odpowiedź otrzymasz jeden punkt.");
        System.out.println("Odpowiedzi musisz zapisywać dużymi literami. Powodzenia!");
        System.out.println(" ");
        System.out.println("1. W którym roku miała miejsce bitwa pod Grunwaldem?");
        System.out.println("A. 1410");
        System.out.println("B. 1415");
        System.out.println("C. 1420");
        System.out.println("D. 1405");
        Scanner scanner = new Scanner(System.in);
        odpGracza[0] = scanner.nextLine();
            if (odpGracza[0].equals(odpDobre[0]))
            {
                punkty++;
                System.out.println("Dobra odpowiedź.");
            }
            else {
                System.out.println("Zła odpowiedź.");
            }
        System.out.println(" ");
        System.out.println("2. W którym roku miał miejsce chrzest Polski?");
        System.out.println("A. 996");
        System.out.println("B. 956");
        System.out.println("C. 966");
        System.out.println("D. 1000");
        odpGracza[1] = scanner.nextLine();
        if (odpGracza[1].equals(odpDobre[1]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("3. Kto był pierwszym królem Polski?");
        System.out.println("A. Bolesław I Chrobry");
        System.out.println("B. Mieszko I");
        System.out.println("C. Mieszko II");
        System.out.println("D. Bolesław III Krzywousty");
        odpGracza[2] = scanner.nextLine();
        if (odpGracza[2].equals(odpDobre[2]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("4. W którym roku Polska odzyskała niepodległość?");
        System.out.println("A. 1919");
        System.out.println("B. 1920");
        System.out.println("C. 1916");
        System.out.println("D. 1918");

        odpGracza[3] = scanner.nextLine();
        if (odpGracza[3].equals(odpDobre[3]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("5. Jakiego polskiego króla próbował zabić Michał Piekarski podczas nieudanego zamachu?");
        System.out.println("A. Władysława II Jagiełłę");
        System.out.println("B. Zygmunta III Wazę");
        System.out.println("C. Zygmunta I Starego");
        System.out.println("D. Zygmunta II Augusta");
        odpGracza[4] = scanner.nextLine();
        if (odpGracza[4].equals(odpDobre[4]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("6. Który z królów polskich panował najdłużej?");
        System.out.println("A. Zygmunt I Stary");
        System.out.println("B. Władysław II Jagiełło");
        System.out.println("C. Zygmunt III Waza");
        System.out.println("D. Stanisław August Poniatowski");
        odpGracza[5] = scanner.nextLine();
        if (odpGracza[5].equals(odpDobre[5]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("7. W jakich latach miały miejsce trzy rozbiory Polski?");
        System.out.println("A. 1772, 1791, 1795");
        System.out.println("B. 1773, 1792, 1794");
        System.out.println("C. 1772, 1793, 1795");
        System.out.println("D. 1774, 1793, 1795");
        odpGracza[6] = scanner.nextLine();
        if (odpGracza[6].equals(odpDobre[6]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else
            {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("8. Jaka była pora roku podczas Odsieczy Wiedeńskiej w 1683 roku?");
        System.out.println("A. Jesień");
        System.out.println("B. Zima");
        System.out.println("C. Wiosna");
        System.out.println("D. Lato");
        odpGracza[7] = scanner.nextLine();
        if (odpGracza[7].equals(odpDobre[7]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        } else
            {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("9. Kto był pierwszym elekcyjnym królem Polski?");
        System.out.println("A. Stefan Batory");
        System.out.println("B. Michał Korybut Wiśniowiecki");
        System.out.println("C. Jan III Sobieski");
        System.out.println("D. Henryk Walezy");
        odpGracza[8] = scanner.nextLine();
        if (odpGracza[8].equals(odpDobre[8]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("10. W którym roku Józef Wybicki napisał słowa \"Mazurka Dąbrowskiego\"?");
        System.out.println("A. 1795");
        System.out.println("B. 1796");
        System.out.println("C. 1798");
        System.out.println("D. 1797");
        odpGracza[9] = scanner.nextLine();
        if (odpGracza[9].equals(odpDobre[9]))
        {
            punkty++;
            System.out.println("Dobra odpowiedź.");
        }
        else {
            System.out.println("Zła odpowiedź.");
        }
        System.out.println(" ");
        System.out.println("Dziękuję za udział w quizie. Twój wynik to: " + punkty + " punktów.");
        if(punkty<=3)
        {
            System.out.println("Niestety nie poszło Ci dobrze. Możesz spróbować jeszcze raz rozwiązać quiz.");
        }
        else if (4<=punkty && punkty<=7)
        {
            System.out.println("Mogło być lepiej, ale Twoja wiedza historyczna nie jest niska.");
        }
        else if(8<=punkty && punkty<=9)
        {
            System.out.println("Twoja wiedzia histroyczna jest na bardzo dobrym poziomie. Gratulacje!");
        }
        else
        {
            System.out.println("Rozwiązałeś quiz na maksymalną liczbę punktów. Masz bardzo rozległą wiedzę " +
                    "historyczną. Gratulacje!");
        }

    }
}
