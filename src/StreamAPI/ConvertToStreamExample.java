package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import Package.main;

public class ConvertToStreamExample {

  // Generate Streams from Arrays using .stream or Stream.of
  public static void streamFromArray() {
    String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };

    // Get Stream using the Arrays.stream
    Stream<String> testStream1 = Arrays.stream(languages);
    testStream1.forEach(x -> System.out.println(x));

    // Get Stream using the Stream.of
    Stream<String> testStream2 = Stream.of(languages);
    testStream2.forEach(x -> System.out.println(x));
  }

  // Generate Streams from Collections
  public static void streamFromCollection() {
    List<String> items = new ArrayList<>();
    for (int i = 0; i < 1500000; i++) {
      items.add(String.valueOf(i));
    }
    String a = "";
    long startTime = System.currentTimeMillis();
    items.stream().forEach(item -> System.out.println(item));
    long endTime = System.currentTimeMillis();

    long m1 = endTime - startTime;

    startTime = System.currentTimeMillis();
    for (String string : items) {
      System.out.println(string);
    }
    endTime = System.currentTimeMillis();

    long m2 = endTime - startTime;
    System.out.println(m1 + " ms");
    System.out.println(m2 + " ms");
  }

  public static void streamUsingGenerate() {
    Stream<String> stream = Stream.generate(() -> "gpcoder").limit(3);
    String[] testStrArr = stream.toArray(String[]::new);
    System.out.println(Arrays.toString(testStrArr)); // [gpcoder, gpcoder, gpcoder]
  }

  // Generate Streams using Stream.iterate()
  public static void streamUsingIterate() {
    Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
    iterateNumbers.forEach(System.out::print); // 12345
  }

  // Generate Streams from APIs like Regex
  public static void streamUsingRegex() {
    String str = "Welcome,to,gpcoder";
    Pattern.compile(",").splitAsStream(str).forEach(System.out::print);// Welcometogpcoder
  }

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i = 0; i < 1000000; i++) {
      numbers.add(i);
    }
    long count = 0;
    
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.printf("There are %d elements that are even", count);

//        count = numbers.stream().filter(num -> num % 2 == 0).count();
//        System.out.printf("There are %d elements that are even", count);

    long startTime = System.currentTimeMillis();
//    count = numbers.stream().filter(num -> num % 2 == 0).count();
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
    long endTime = System.currentTimeMillis();
   
    long m1 = endTime - startTime;
    System.out.println(count);
    
    startTime = System.currentTimeMillis();
    
    long count2 = 0;
    int c = numbers.size();
    for (int i = 0; i < c; i++) {
      System.out.println(numbers.get(i));
    }
    
    endTime = System.currentTimeMillis();
    long m2 = endTime - startTime;
    System.out.println(count2);
    System.out.println(m1 + " ms");
    System.out.println(m2 + " ms");

//    streamFromCollection();
//      comparePerformance();  
  }
}