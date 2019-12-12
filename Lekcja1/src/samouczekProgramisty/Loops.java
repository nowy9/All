package samouczekProgramisty;

public class Loops {
    private static void printCharPerLineFromEndToBegin(int number) {
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            System.out.println(reminder);
        }

    }
    private static void printCharPerLineFromBeginToEnd(int number){
        int copyNumber = number;
        int ile_cyfr=0;
        while (number > 0) {
            number /=10;
            ile_cyfr++;
        }
        int [] tab = new int [ile_cyfr];
        for (int i=ile_cyfr-1; i>=0; i--){
            tab[i] = copyNumber%10;
            copyNumber /= 10;
        }
        for (int i=0; i<ile_cyfr; i++){
            System.out.println(tab[i]);
        }

    }

    public static void main(String[] args) {
        printCharPerLineFromEndToBegin(98470);
        System.out.println("----------------");
        printCharPerLineFromBeginToEnd(98470);

    }
}
