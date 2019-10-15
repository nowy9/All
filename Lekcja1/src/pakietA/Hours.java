package pakietA;

public class Hours {

    public static void main(String[] args) {

        int hours = -3;
        int numberOfSeconds = 0;
        Seconds instance = new Seconds();
        try {
            numberOfSeconds = instance.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException exception) {
            numberOfSeconds = instance.getNumberOfSeconds(hours * -1);
            System.out.println(numberOfSeconds);
        }
    }
}
