package pakietA;
/*
Napisz program, w którym zasymulujesz hierarchię dziedziczenia zwierząt.
Stwórz abstrakcyjną klasę Animal, po której będą dziedziczyły klasy Fish
i Mammal. Wszystkie te klasy powinny być abstrakcyjne. Następnie stwórz
konkretne klasy które dziedziczą po Fish i Mammal. Będą to odpowiednio
Goldfish i Man.
Nadpisz metodę toString w każdej z tych klas. Stwórz instancje obu tych klas
i wyświetl je na konsoli.
 */

/*
public abstract class Animal {

}
public abstract class Fish extends Animal {

}
public abstract class Mammal extends Animal{

}
public class Goldfish extends Fish {
    @Override
    public String toString() {
    return "I'm a goldfish. I like to swim :).";
    }
}
public class Man extends Mammal {
    @Override
    public String toString() {
        return "I'm a human.";
    }
}
public class Main {
    public static void main (String[] args){
        Animal fish = new Goldfish();
        Mammal human = new Man();
        System.out.println(human);
        System.out.println(fish);
    }
}
*/