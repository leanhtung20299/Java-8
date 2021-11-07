package Exception;

import java.util.Scanner;

public class cauC {
  public static void main(String[] args) {
      long n;
      int k;
      Scanner sc = new Scanner(System.in);
      n = sc.nextLong();
      k = sc.nextInt();
      System.out.println(shortestWayToZero(n,k));
    
  }
  public static long shortestWayToZero(long n, long k) {
    long dem = 0 ;
    while(true) {
      if(n%k==0) {
        dem++;
        n=n/k;
      }else {
        dem++;
        n--;
      }
      if(n==0) return dem;
    }
  }
}
