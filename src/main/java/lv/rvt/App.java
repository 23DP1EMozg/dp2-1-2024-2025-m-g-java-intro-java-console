package lv.rvt;
import java.util.Scanner;

public class App
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int count = 0;
      int sum = 0;
      
      while(true){
        System.out.println("Enter a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if(number == 0){
            break;
        }

        sum += number;
        count++;
      }

      System.out.println("Number of numbers: " + count);
      System.out.println("Sum of the numbers: " + sum);

      scanner.close();
   }
}