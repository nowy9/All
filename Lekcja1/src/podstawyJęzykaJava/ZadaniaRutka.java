/*
package podstawyJęzykaJava;

import java.util.Scanner;


public class ZadaniaRutka extends Tablice {
    public static void main(String[] args) {
        System.out.println("::RATY ANNUITETOWE (RÓWNE)::");
        System.out.println(" ");
        System.out.println("Podaj kwotę kredytu (zł):");
        Scanner scanner = new Scanner(System.in);
        double kwota = scanner.nextDouble();
        System.out.println("Podaj liczbę rat:");
        int raty = scanner.nextInt();
        System.out.println("Podaj liczbę rat płatnych w ciągu jednego roku:");
        int ratyRok = scanner.nextInt();
        System.out.println("Podaj oprocentowanie raty (%):");
        double oprocentowanieProcent = scanner.nextDouble();
        double oprocentowanie = oprocentowanieProcent/100;
        double suma = 0;
        for (int i=1; i<=raty; i++){
            suma += Math.pow((1+oprocentowanie/ratyRok), -i);
        }
        double jednaRata = kwota/suma;

        System.out.println("ZESTAWIENIE RAT");
        System.out.println("Nr raty | Część kapitałowa | Część odsetkowa | Rata całkowita");
        double [] odsetkowa = new double[raty];
        double [] kapitalowa = new double[raty];
        for (int i=0; i<raty; i++){
           kapitalowa[i] = 0;
        }
        odsetkowa[0] = oprocentowanie*kwota/ratyRok;
        kapitalowa[0] = jednaRata - odsetkowa[0];
        for (int i=1; i<raty; i++){
            odsetkowa[i] = oprocentowanie*(kwota-sumaTablicy(kapitalowa))/ratyRok;
            kapitalowa[i] = jednaRata - odsetkowa[i];
        }

        for (int i=1; i<=raty; i++) {
            System.out.println(i + " | " + Math.round(kapitalowa[i-1]) + " | " + Math.round(odsetkowa[i-1]) + " | " + Math.round(jednaRata));
        }
        double x = 6*jednaRata;
        double y = x-kwota;
        System.out.println("Kwota udzielonego kredytu to: " + kwota + "." + " Kwota, którą należy oddać to: " + Math.round(x) + ".");
        System.out.println("Koszt kredytu wynosi: " + Math.round(y) + ".");





    }
}
*/