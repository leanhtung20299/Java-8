package Exception;

import java.util.Scanner;

public class For {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while (true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(countPerfectTeam( a,  b,  c));   
    }
  }

  public static int countPerfectTeam(int a, int b, int c) {
    long dem = a + b + c;
    int tong = 0;

    if (dem >= 3) {
      if (a >= 1 && b >= 1 && c >= 1) {
        a--;
        b--;
        c--;
        tong++;
      }
      if (a > 0 && b > 0) {
        int max = 0 ;
        int min = 0 ;
        if (a > b) { 
          max = a;
          min = b;
        } else {
          max = b;
          min = a;
        }
       
        while (true) {
         
          if (max >= 2 && min >= 1) {
            max = max - 2;
            min = min - 1;
            tong = tong + 1;
          }
          if(max < min ) {
            int swap = max ;
            max = min;
            min = swap; 
          }
          if (min == 0)
            break;
        }
      }

    }

    if (dem < 3)
      return 0;
    return tong;
  }
}
