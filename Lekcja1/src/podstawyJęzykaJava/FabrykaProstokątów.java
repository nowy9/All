package podstawyJęzykaJava;

public class FabrykaProstokątów
{
    public static void main (String[] args)
    {
        Prostokąt prostokątNumerJeden = new Prostokąt(8,5);
        Prostokąt prostokątNumerDwa = new Prostokąt (10,4);
        System.out.println(prostokątNumerJeden.getA());
        prostokątNumerJeden.setA(12);
        System.out.println(prostokątNumerJeden.getA());

    }
}
