package Exception;

import java.util.Scanner;

public class Java {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(findCount(sc.nextInt()));
  }

  public static int findCount(int n) {
    int x = 0;
    int m = n;
    int sum = 0;
    while (m > 0) {
      sum += m % 10;
      m /= 10;
      x++;
    }
    int start = 1;
    int cnt = 0;
    int i = start;
    while (i <= n) {
      int cur = 0;
      int temp = i;

      while (temp != 0) {
        cur += temp % 10;
        temp = temp / 10;
      }
      if (cur == sum) {
        cnt++;
        i += 9;
      } else
        i++;
    }
    return cnt;
  }
}
