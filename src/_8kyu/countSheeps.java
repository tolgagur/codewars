package _8kyu;
import java.util.Arrays;
import java.util.stream.Collectors;

public class countSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(aBoolean -> aBoolean!=null)
                .filter(aBoolean -> aBoolean==true).toArray().length;
    }
}
