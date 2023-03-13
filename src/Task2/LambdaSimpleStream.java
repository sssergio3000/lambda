package Task2;

import java.util.*;
import java.util.stream.Stream;

public class LambdaSimpleStream {

    public static void main(String[] args) {


        List<Integer> listInt = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {

            listInt.add(rand.nextInt(20));

        }
        System.out.println(Arrays.asList(listInt));
        Stream<Integer> stream = listInt.stream();
        Stream<Integer> mappedStream = stream.map(p -> p * p);
        Optional<Integer> sumOptional = mappedStream.reduce(Integer::sum);
        Integer sum = sumOptional.get();
        System.out.println(sum);


    }
}
