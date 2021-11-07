package LambdaExpression;

import java.util.List;

@FunctionalInterface
public interface functionalinterfacetest {
  List<String> test1(String a,String b, int c);
  
  
  default void test2() {};
  static void test3() {};
}

//biconsumer - consumer