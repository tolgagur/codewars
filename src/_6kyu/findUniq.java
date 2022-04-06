package _6kyu;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class findUniq {
    public static double findUniq(double arr[]) {
        return IntStream.range(0, arr.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> arr[i], Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() == 1)
                .mapToDouble(doubleLongEntry -> doubleLongEntry.getKey())
                .findFirst()
                .getAsDouble();
    }
}
