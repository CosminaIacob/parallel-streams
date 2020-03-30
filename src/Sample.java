import java.util.Arrays;
import java.util.List;

public class Sample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // find the total of double of even numbers

        // imperative style of programming
        // has accidental complexity
        int total = 0;

        for (int e : numbers) {
            if (e % 2 == 0) {
                total += e * 2;
            }
        }

        System.out.println("Imperative style " + total);

        // functional style - functional composition
        // has less complexity and is easier to parallelize
        // collection pipeline pattern
        System.out.println("Functional style " +
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());
    }
}
