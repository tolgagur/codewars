package _6kyu;

import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerListEntry -> integerListEntry.getValue()>0)
                .map(stringLongEntry -> stringLongEntry.getKey())
                .count();

    }


}
