package _6kyu;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class FindOdd {
    public static int findIt(int[] a) {
        return IntStream.range(0,a.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> a[i],Collectors.counting()))
                .entrySet().stream()
                .filter(integerLongEntry -> integerLongEntry.getValue()%2==1)
                .mapToInt(integerLongEntry -> integerLongEntry.getKey())
                .findFirst().getAsInt();
    }
}