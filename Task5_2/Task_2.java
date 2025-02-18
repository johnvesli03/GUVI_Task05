package Task5_2;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main (String[]args){
    List<String> strings = Arrays.asList("abc", "","bc","efg","abcd","","ikl");
        List<String> EmptyStrings = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
        System.out.println(EmptyStrings);

    }
}
