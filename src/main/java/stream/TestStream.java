package stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    
    public static void main(String[] args) {
    
        try {
            String content = Files.readAllLines(Paths.get("C:\\tmp\\a.txt"), StandardCharsets.ISO_8859_1).stream()
                    .collect(Collectors.joining("\n"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
//        Stream.iterate(0, n -> n + 3).limit(10). forEach(x -> System.out.print(x + " "));
        
        /*String text = "1";
        Optional.ofNullable(text).ifPresent(System.out::println);*/
        
        /*IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);*/
        
        /*// 1. Array
        String[] strArray1 = Stream.toArray(String[]::new);
// 2. Collection
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
        Set set1 = stream.collect(Collectors.toSet());
        Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));
// 3. String
        String str = stream.collect(Collectors.joining()).toString();*/
    }
    
}
