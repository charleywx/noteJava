package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class TestParallelStream {
    
    public static void main(String[] args) {
        convertTest1();
    }
    
    public static void convertTest1() {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected = collected.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collected);
    }
    
    public static void convertTest() {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected = collected.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));//注意发生的变化
        System.out.println(collected);
    }
    
    public static void parallelStream1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream()
                .forEach(out::println);
    }
    
    public static void parallelStream2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream()
                .forEachOrdered(out::println);
    }
    
}
