package podstawyJęzykaJava;



import java.util.Random;
import java.util.stream.Collectors;

public class LottoUpgrade {

    public static void main(String[] args) {
        String lotto = new Random().ints(1, 50).distinct().limit(6).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Lotto: " + lotto);
    }
}
