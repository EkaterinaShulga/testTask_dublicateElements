package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer[] elements = {3, 4, 7, 5, 9, 1, 3, 5, 8, 6, 7, 2, 1, 8};
        ArrayList<Integer> arList = new ArrayList<>(Arrays.asList(elements));
        Map<Integer, Integer> mapElements = arList.stream().collect(Collectors.toMap(Function.identity(),
                value -> 1, Integer::sum));
        mapElements.forEach((key, value) -> System.out.print(key + ":" + value + " "));

    }


}
