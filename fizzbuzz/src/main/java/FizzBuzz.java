import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzz {

    private IntStream integerList;

    public FizzBuzz(Integer length) {
        assert length >= 0 : "length should not be negative";
        integerList = IntStream.rangeClosed(0, length - 1);
    }

    public IntStream getIntegerList() {
        return integerList;
    }


    public List<String> fizzBuzz() {
        return integerList.mapToObj(String::valueOf).collect(toList());
    }
}
