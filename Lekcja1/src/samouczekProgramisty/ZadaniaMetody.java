package samouczekProgramisty;
/*
Metody
1. Napisz metodę, która zwróci Twój aktualny wiek.
2. Napisz metodę, która zwróci Twoje imię,
3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże),
8. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
*/
public class ZadaniaMetody {
    public static void main(String[] args) {
        System.out.println("Rozwiązania:");
        System.out.println(getMyAge());
        System.out.println(getMyName());
        printMathEquationResults(2,1);
        System.out.println(isEven(4));
        System.out.println(couldDivideBy3and5(15));
        System.out.println(thirdPow(2));
        System.out.println(squareRoot(9));
        System.out.println(canConstructRightAngledTriangle(3,4,5));
    }
    private static int getMyAge() {
        return 22;
    }
    private static String getMyName() {
        return "Adrian";
    }
    private static void printMathEquationResults(double arg1, double arg2){
        System.out.println(arg1 + arg2);
        System.out.println(arg1 - arg2);
        System.out.println(arg1 * arg2);
    }
    private static boolean isEven(double number) {
        return number % 2 == 0;
    }
    private static boolean couldDivideBy3and5(double number){
        return number % 3 == 0 && number % 5 == 0;
    }
    private static double thirdPow(double number){
        return Math.pow(number, 3);
    }
    private static double squareRoot(double number){
        return Math.sqrt(number);
    }
    private static boolean canConstructRightAngledTriangle(double number1, double number2, double number3 ) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            return false;
        }
        double longest = number1;
        double side1 = number2;
        double side2 = number3;
        if (number2>number1 && number2>number3){
            longest=number2;
            side1=number1;
        }
        else if(number3>number1 && number3>number2){
            longest=number3;
            side2=number1;
        }
        return side1*side1+side2*side2==longest*longest;
    }
}
