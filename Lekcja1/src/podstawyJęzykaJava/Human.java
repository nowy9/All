package podstawyJęzykaJava;
/*
Napisz klasę Man, która będzie reprezentowała człowieka.
Niech klasa ta posiada atrybuty takie jak imię, wiek, kolor oczu, kolor włosów.
Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję
takiej klasy.
*/
public class Human {
    private String name;
    private int age;
    public enum EyeColour {
        BLUE,
        BROWN,
        GREEN,
        BLACK,
        GREY
    }
    public enum HairColour {
        BLACK,
        BROWN,
        BLONDE,
        GINGER,
        GREY
    }
    private EyeColour eyeColour;
    private HairColour hairColour;

    public Human(String name, int age, EyeColour eyeColour, HairColour hairColour) {
        this.name = name;
        this.age = age;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EyeColour getEyeColour() {
        return eyeColour;
    }

    public HairColour getHairColour() {
        return hairColour;
    }

    public static void main(String[] args) {
        Human marcin = new Human("Marcin", 31, EyeColour.BLUE, HairColour.BLONDE);

        System.out.println(marcin.getName());
        System.out.println(marcin.getEyeColour());

    }
}