package podstawyJęzykaJava;

public class Srednia
{
    public static void main (String args[])
    {
        int numberOfClasses = 3;
        int numberOfNotes = 4;
        double srednia=0;
        int [][] tab = new int [][] {{5,4,5,3}, {4,2,3,1}, {6,5,4,4}};
        for (int x=0;x<numberOfClasses;x++)
        {
            for (int y=0;y<numberOfNotes;y++)
            {
                srednia += tab[x][y];
            }
        }
        srednia = srednia / (numberOfClasses*numberOfNotes);
        System.out.format("Średnia ocen wynosi: %.2f%n", srednia);



    }
}
