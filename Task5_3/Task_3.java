package Task5_3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[]args) {
            List<String> names = Arrays.asList("Sachin", "Anil", "John", "Amar", "Chaithanya", "Alexa", "Akash", "Guru", "Joel", "Amir","Chowdhary");
            List<String> FilteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
            System.out.println(FilteredNames);

        }

    }