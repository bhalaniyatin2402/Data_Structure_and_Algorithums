import java.util.*;

public class HalfPyramidWithNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");

    int n = sc.nextInt();

    for(int i=1; i<=n; i++) {
      for(int j=1; j<=(n-i+1); j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
