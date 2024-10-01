package lv.rvt;
import java.util.Scanner;

public class App
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double sum = 0;
      int numbers = 0;
      double average = 0.0;
      int even = 0;
      int odd = 0;

      System.out.println("Give numbers: ");

      while (true) {
         int num = Integer.parseInt(scanner.nextLine());

         if(num == -1){
            break;
         }

         sum += num;
         numbers += 1;

         if(num % 2 == 0){
            even++;
         }else{
            odd++;
         }
      }

      average = sum / numbers;

      System.out.println("Thx! Bye!");
      System.out.println("Sum: " + sum);
      System.out.println("Numbers: " + numbers);
      System.out.println("Average: " + average);
      System.out.println("Even: " + even);
      System.out.println("Odd: " + odd);
      scanner.close();
   }
}