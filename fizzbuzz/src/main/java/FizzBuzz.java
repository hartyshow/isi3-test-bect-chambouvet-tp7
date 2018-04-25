import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
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
        Predicate<Integer> multipleOfThreePredicate = item -> item % 3 == 0;
        Predicate<Integer> multipleOfFivePredicate = item -> item % 5 == 0;
        Predicate<Integer> multipleOfThreeAndFivePredicate = item -> item % 3 == 0 && item % 5 == 0;
        Predicate<Integer> multipleOfSevenPredicate = item -> item % 7 == 0;
        Predicate<Integer> universalAnswerPredicate = item -> item == 42;
        Predicate<Integer> equalsZeroPredicate = item -> item == 0;

        List<String> fizzBuzzed = new ArrayList<>();
        integerList.forEach(item -> {
            String value = String.valueOf(item);
            if(multipleOfThreePredicate.test(item))
                value = "Fizz";
            if(multipleOfFivePredicate.test(item))
                value = "Buzz";
            if(multipleOfThreeAndFivePredicate.test(item))
                value = "Fizz Buzz";
            if(multipleOfSevenPredicate.test(item))
                value = "It's a trap";
            if(universalAnswerPredicate.test(item))
                value = "La grande question sur la vie, l'univers et le reste";
            if(equalsZeroPredicate.test(item))
                value = "0";

            fizzBuzzed.add(value);
        });

        return fizzBuzzed;
    }
}
