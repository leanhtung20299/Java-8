package Exception;

import java.util.Scanner;

public class Daonguocchuoi {
  public static void main(String[] args) {
    String a;
    int k;
    Scanner sc = new Scanner(System.in);
    a = sc.nextLine();
    k = sc.nextInt();
    System.out.println(reverseString(a,k));
  }
  public static String reverseString(String str, int k) {
    StringBuffer buffer = new StringBuffer(str);
    for(int i = 0 ;i< str.length() ; i++) {
      if(i==0) {
        String a = new StringBuilder(str.substring(i, i+k)).reverse().toString();
        buffer.replace(i, i+k, a);
      }
      if(i==2*k) {
        String a = new StringBuilder(str.substring(i,i+k)).reverse().toString();
        buffer.replace(i, i+k, a);
        return buffer.toString();
      }
    }
    return buffer.toString();
  }
}
