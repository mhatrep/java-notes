import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
  
List<String> items = Arrays.asList("AAA", "BBB", "CCC");
List<String> output = items.stream()  
		.filter(line -> !"BBB".equals(line))
		.collect(Collectors.toList()); 
output.forEach(System.out::println); 
