package podstawyJęzykaJava;

public class DodawanieIZakres
{

    public int dodaj(int x, int y)
    {
        return x+y;
    }
    public boolean sprawdzZakres(int liczba, int min, int max)
    {
        if (liczba>=min && liczba<=max) return true;
        else return false;
    }
}
