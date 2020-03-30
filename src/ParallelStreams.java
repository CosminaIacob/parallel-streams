import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

    // sequential execution (.stream()) vs parallel (.parallelStream())

    public static int transform(int number) {
        sleep(1000);
        return number * 1;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.parallelStream()
                .map(e -> transform(e))
                .forEach(System.out::println);
    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }
}
