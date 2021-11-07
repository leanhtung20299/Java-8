package LambdaExpression;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class main {
  public static void main(String[] args) {
    functionalinterfacetest functionalinterfacetest = (int a) ->{
      System.out.println("ABC : "+a);
      };
      
//      functionalinterfacetest
      BiConsumer<String,String> consumer2 = (value,value2) -> {
        int a = 10;
        System.out.println(value);
        System.out.println(value2);
      };
      consumer2.accept("10", "233");
    
  }
}
