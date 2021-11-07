package StaticBlock;

public class ObjectTest {
  private static final int a = 100;
  static {
    System.out.println("Static block running");
  }
  public static int getA() {
    return a;
  }
} 
