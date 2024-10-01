package lv.rvt;
import java.util.Scanner;

public class App
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      printUntilNumber(5);
      scanner.close();
   }


   public static void printUntilNumber(int n){
      for(int i = 1; i<=n; i++){
         System.out.println(i);
      }
   }
}