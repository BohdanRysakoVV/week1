package Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public int[] positiveSorter(int[] array) {

        List<Integer> result = (Arrays.stream(array).filter(i -> i >= 0).sorted()
                .boxed().collect(Collectors.toList()));

        Collections.reverse(result);

        return result.stream().mapToInt((i) -> i).toArray();
    }

}
