import java.io.*;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 1; i <= 9; i++) { //1
      dfs(i, n);  //dfs = depth first search function
    }
  }

  public static void dfs(int i, int n) {
    if (i > n) { //2
      return;
    }
    System.out.println(i); //3
    for (int j = 0; j < 10; j++) { //4
      dfs(10 * i + j, n);
    }
  }

}