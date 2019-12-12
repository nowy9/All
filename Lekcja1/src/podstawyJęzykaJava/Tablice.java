package podstawyJęzykaJava;

public class Tablice
{
    public static void main(String[] args)
    {
        int[] tab = new int[] {1, 2, 3};
        System.out.println(tab[2]);
        double pi = Math.PI;
        System.out.format("%.2f%n", pi);
        int [] tablica = new int [] {1, 2, 3, 4, 5};
        int [] tablicaa = new int [5];
        for (int i =0; i<5; i++) {
            tablica[i] = tablica[i] * 2;
        }
            for (int i=0; i<tablicaa.length; i++){
                tablicaa[i] = tablica[i];
            }

        for (int i=0; i<5; i++) {
            tablica[i] = tablica[i]/2;
        }
        System.out.println("Elementy pierwszej tablicy: ");
        for (int i=0; i<5; i++){
            System.out.println(tablica[i]);
        }
        System.out.println("Elementy drugiej tablicy: ");
        for (int i = 0; i<5; i++){
            System.out.println(tablicaa[i]);
        }

    }


}
