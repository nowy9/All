package podstawyJęzykaJava;

public class Etykieta
{
    public static void main (String[] args)
    {
        etykieta: for(int i=1; i<10; i++)
        {
            if (i%2==0) continue etykieta;
            System.out.println(i);

        }
    }
}
