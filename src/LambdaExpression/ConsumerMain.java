package LambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Package.main;

public class ConsumerMain {
  private static Stream<String> stream;

  public static void kt(String val) {
    System.out.println(val);
  }

  public static void main(String[] args) {
//		Consumer<String> consumerdemo = name -> {
//			int a = 3;
//			if(a>5) System.out.println(name);
//			else System.out.println(name+10);
//		};
//		consumerdemo.accept("abc");
//		
//		Consumer<String> consumerdemo2 = ConsumerMain::kt ;
//		consumerdemo2.accept("12");
//		
//		functionalinterfacetest functionalinterfacetest = ( c ,  b , a) ->{
//		  List<String> list = new ArrayList<>();
//		  list.add("123");
//		  list.add("456");
//		  list.add("123a");
//      list.add("456a");
//      list.add("123");
//      list.add("456a");
//      list.add("1232");
//      list.add("456");
//		  if(a>10)
//		  System.out.println(c+b+a);
//		  else 
//		    System.out.println("error");
//		  return list;
//		};
//		functionalinterfacetest.test1("abc","xyz",8); 
//    functionalinterfacetest.test1("abc","xyz",8).stream().filter(u -> u!="456").limit(3).forEach(System.out::println);

//    List<String> list = new ArrayList<>();
//    list.add("123");
//    list.add("456");
//    list.add("12");
//    list.add("456");
//    list.add("123");
//    list.add("456");
//    list.add("1232");
//    list.add("456");
//    list.add("756");
//    Stream<String> stream = list.stream();
//    stream.sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);
    
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(12, "Yes");
    map.put(13, "Yes");
    map.put(15, "Yes");
    map.put(16, "Yes2");
    map.put(17, "Yes");
    map.put(14, "Yes2");
   
   map.entrySet().stream().filter(u -> u.getValue()=="Yes").collect(Collectors.groupingBy(String::getValue("Yes")));
    
//    Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
//    iterateNumbers.forEach(System.out::print); // 12345
    
//    Stream.of(1, 2, 3, 4).filter(u -> u > 2).limit(2).forEach(System.out::println);

//    Stream 1. Initial 
//    Stream 2. 
//    Stream 3. Terminal 
  }
}
